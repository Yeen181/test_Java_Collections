import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> li = input();
        List<String> list = getWednesdays(li);
        System.out.println("Mảng chứa các ngày thứ Tư:");
        for (String wednesday : list) {
            System.out.println(wednesday);
        }
    }
    public static List<String> input() {
        List<String> dateList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng ngày tháng năm:");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập các ngày tháng năm (dd/MM/yyyy):");
        for (int i = 0; i < n; i++) {
            dateList.add(sc.nextLine());
        }
       // LocalDate dt = LocalDate.parse(sc.nextLine());
        return dateList;
    }
    public static List<String> getWednesdays(List<String> dateList) {
//        LocalDate dt = LocalDate.of(2023,12,20);
//        System.out.println(dt.getDayOfWeek());
        List<String> wednesdayList = new ArrayList<>();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yy");
        for (String inputDate : dateList) {
            try {
                Date date = simpleDateFormat.parse(inputDate);
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(date);
                if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.WEDNESDAY) {
                    wednesdayList.add(inputDate);
                }
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
        }
        return wednesdayList;
    }
}


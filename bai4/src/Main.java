import java.util.*;
public class Main {
    public static void main(String[] args) {
        //List<Integer>[] lst = new List[4];
        List<List<Integer>> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("so luong danh sach: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            list.add(input());
        }
        System.out.println("danh sach ban dau: "+ list);
        list.sort((list1, list2) -> {
            double avg1 = average(list1);
            double avg2 = average(list2);
            return Double.compare(avg2, avg1);
        });
        System.out.println("danh sach da duoc sap xep giam dan: "+list);
    }
    private static double average(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            return 0;
        }
        int sum = 0;
        for (int x : list) {
            sum += x;
        }
        return (double) sum / list.size();
    }
    public static List<Integer> input(){
        List<Integer> li = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so luong: ");
        int n = sc.nextInt();
        System.out.println("nhap phan tu: ");
        for (int i = 0; i<n;i++){
            li.add(sc.nextInt());
        }
        return li;
    }
}
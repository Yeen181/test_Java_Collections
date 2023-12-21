import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();
        System.out.println("nhap so luong phan tu mang: ");
        int n = sc.nextInt();
        int [] a = new int[n];
        int [] b = new int[n];
        System.out.println("nhap phan tu trong mang 1: ");
        for (int i = 0; i < n; i++){
            a[i]= sc.nextInt();
            set.add(a[i]);
        }
        System.out.println("nhap phan tu trong mang 2: ");
        for (int i = 0; i < n; i++){
            b[i] = sc.nextInt();
            set.add(b[i]);
        }
        System.out.println("các phần tử không trùng nhau cua 2 mang: "+ set);
    }
}
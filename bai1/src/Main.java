import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.println("nhap so phan tu trong mang: ");
        int n = sc.nextInt();
        int [] a = new int[n];///123456789
        //int [] b = new int[n];//49
        System.out.println("nhap phan tu trong mang: ");
        for (int i = 0; i < n;i++){
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++){
            int sqrt = (int) sqrt(a[i]);
            if(sqrt * sqrt == a[i]) list.add(a[i]);
        }
        System.out.println("các phần tử là số chính phương: "+ list);
    }

}
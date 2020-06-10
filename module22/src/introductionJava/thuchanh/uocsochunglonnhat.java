package introductionJava.thuchanh;

import java.util.Scanner;

public class uocsochunglonnhat {
    public static void main(String[] args) {
        Scanner nhap = new Scanner(System.in);
        int a;
        int b;
        System.out.println("Nhập số a: ");
        a = nhap.nextInt();
        System.out.println("Nhập số b: ");
        b = nhap.nextInt();
        a = Math.abs(a);
        b = Math. abs(b);
        if (a == 0 || b == 0){
            System.out.println("không có ước chung lớn nhất");
        }
        while (a != b){
            if (a > b)
                a = a -b;
            else
                b = b - a;
            }
            System.out.println("Ước chung lớn nhất: " + a);
        }

}

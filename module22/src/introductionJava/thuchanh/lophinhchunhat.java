package introductionJava.thuchanh;

import java.util.Scanner;

public class lophinhchunhat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập width: ");
        double width = scanner.nextDouble();
        System.out.print("Nhập height: ");
        double height = scanner.nextDouble();
        Rectangle abc = new Rectangle(width,height);
        System.out.println("Kết quả là: " +abc.getPerimeter());
    }
}

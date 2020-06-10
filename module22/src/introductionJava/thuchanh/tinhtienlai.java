package introductionJava.thuchanh;

import java.util.Scanner;

public class tinhtienlai {
    public static void main(String[] args) {
        double money = 0;
        int month = 1;
        double interset_rate = 1.0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền muốn gửi: ");
        money = scanner.nextDouble();
        System.out.println("Nhập kỳ hạn gởi: ");
        month = scanner.nextInt();
        System.out.println("Nhập lãi suất: ");
        interset_rate = scanner.nextDouble();
        double total_interset = 0;
//        for (int i = 0; i < month; i++){
            total_interset = money * (interset_rate/100/12) * 3;
//        }
        System.out.println("Tổng số tiền là: " + total_interset);
    }
}

package introductionJava.thuchanh;

import java.util.Scanner;

public class menuungdung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu: ");
        System.out.println("1. Hình Tam Giác");
        System.out.println("2. Hình vuông");
        System.out.println("3.Hình Chữ Nhật");
        System.out.println("0.Thoát");
        System.out.println("Nhập lựa chọn của bạn: ");
        while (true){
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Hình Tam Giác");
                    System.out.println("******");
                    System.out.println("*****");
                    System.out.println("****");
                    System.out.println("***");
                    System.out.println("**");
                    System.out.println("*");
                    break;
                case 2:
                    System.out.println("Hình Vuông");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 3:
                        System.out.println("Hình Chữ Nhật");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 0:
                    System.exit( 0);
                default:
                    System.out.println("No Choice");
                    break;
            }
        }
    }
}

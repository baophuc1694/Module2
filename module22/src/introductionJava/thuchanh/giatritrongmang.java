package introductionJava.thuchanh;

import java.util.Scanner;

public class giatritrongmang {
    public static void main(String[] args) {
        String[] studen = {"Phuc", "Toan", "Quoc", "Hai", "Tra", "Dang", "Thinh", "Ngan", "Hoat", "Trung"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tiên học sinh: ");
        String input_name = scanner.nextLine();
        boolean isExist = false;
        for (int i =0; i < studen.length; i++){
            if (studen[i].equals(input_name)){
                System.out.println("Vị trí của học sinh trong danh sách là: " + input_name +  " vị trí:  " + (i + 1));
                isExist =true;
                break;
            }
        }
        if (!isExist)
            System.out.println("không tìm thấy" + input_name + "trong danh sách");
    }
}

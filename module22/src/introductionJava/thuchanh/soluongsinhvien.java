package introductionJava.thuchanh;

import java.util.Scanner;

public class soluongsinhvien {
    public static void main(String[] args) {
        int size;
        int[]array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập số lượng học sinh: ");
            size = scanner.nextInt();
            if (size > 30)
                System.out.println("Nhập số lượng học sinh không quá 30");
        }while (size > 30);
        array = new int[size];
        int i =0;
        while (i < array.length){
            System.out.println("Nhập điểm cho học sinh: " + (i +1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        int count = 0;
        System.out.println("List of mark: ");
        for (int j = 0; j < array.length; j++){
            System.out.println(array[j] + "\t");
            if (array[j] >= 5 && array[j] <= 10)
                count++;
        }
        System.out.println("\n Số lượng học sinh vượt qua kỳ thi là: " + count);
    }
}

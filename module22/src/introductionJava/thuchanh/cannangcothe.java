package introductionJava.thuchanh;

import java.util.Scanner;

public class cannangcothe {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        double weight;
        double height;
        double bmi;

        System.out.println("Nhập cân nặng cơ thể: ");
        weight = scanner.nextDouble();
        System.out.println("Nhập chiều cao của cơ thể: ");
        height = scanner.nextDouble();
        bmi = weight / Math.pow(height,2);
        System.out.print("Chỉ số bmi của bạn là: " + bmi);
        if (bmi < 18){
            System.out.print("Bạn quá gầy");
        }else if (bmi < 25.0){
            System.out.print("Bạn bình thường");
        }else if (bmi < 30.0){
            System.out.print("Bạn hơi béo 1 tí không chi đâu đừng sợ");
        }else {
            System.out.print("Bạn quá béo, có nguy cơ bị tiểu đường, mỡ trong máu, gan nhiễm mỡ");
        }
    }
}

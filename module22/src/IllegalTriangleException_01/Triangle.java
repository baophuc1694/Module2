package IllegalTriangleException_01;

import IllegalTriangleException;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Triangle {
    private static <IllegalTriangleException extends Throwable> void tamgiac() throws IllegalTriangleException{
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Nhập cạnh x: ");
            int x = scanner.nextInt();
            System.out.println("Nhập cạnh y: ");
            int y = scanner.nextInt();
            System.out.println("Nhập canh z: ");
            int z = scanner.nextInt();
            if (x > 0 && y > 0 && z > 0){
                System.out.println("3 cạnh của tam giác có giá trị lần lượt là: x = " + x + "\t" + "y = " + y +  "\t" + "z = " + z + "\t" );
            }else throw new IllegalTriangleException("Xin hãy nhập lại");
            if (x + y > z && y + z > x && x + z > y ){
                System.out.println("Bạn đã nhập đúng");
            }else throw new IllegalTriangleException("Tổng 2 cạnh của tam giác phải lớn hơn cạnh còn lại, hãy nhập lại");
        }catch (InputMismatchException e){
            throw new IllegalTriangleException("Cạnh của tam giác phải là số dương");
        }
    }

    public static void main(String[] args) throws IllegalTriangleException {
        Triangle tri = new Triangle();
        try {
            tri.tamgiac();
        }catch (IllegalTriangleException e){
            System.out.println(e.getMessage());
        }
    }
}

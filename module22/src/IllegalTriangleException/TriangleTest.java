package IllegalTriangleException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TriangleTest {
    public static void tamgiac() throws IllegalTriangleException{
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Nhập cạnh x: ");
            int x = scanner.nextInt();
            System.out.println("Nhập cạnh y: ");
            int y = scanner.nextInt();
            System.out.println("Nhập cạnh z: ");
            int z = scanner.nextInt();
            if (x > 0 && y > 0 && z > 0){
                System.out.println("Tam giác có cạnh x = " + x +  "\t" + "cạnh y = " + y + "\t" + "cạnh z = " + z + "\t");
            }else throw new IllegalTriangleException("Giá trị của cạnh phải < 0, nhập lại");
            if (x + y > z && y + z > x && x + z > y){
                System.out.println(" Tổng ba cạnh là: " + (x + y + z));
            }else throw new IllegalTriangleException("Tổng của 2 cạnh phải lớn hơn cạnh còn lại");
        }catch (InputMismatchException e){
            throw new IllegalTriangleException("Số nhập vào của 1 cạnh phải là số dương");
        }
    }

    public static void main(String[] args) {
        TriangleTest tri = new TriangleTest();
        try {
            tri.tamgiac();
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());;
        }
    }
}

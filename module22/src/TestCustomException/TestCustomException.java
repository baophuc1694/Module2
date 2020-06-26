package TestCustomException;
import java.util.Scanner;
public class TestCustomException {
    public TestCustomException(int age) throws InvalidAgeException {
        if (age < 18)
            throw new InvalidAgeException("Bạn chưa đủ tuôi");
    }

    public static void main(String[] args) {
        try {
            System.out.println("Nhập tuôi");
            int age = new Scanner(System.in).nextInt();
            TestCustomException a = new TestCustomException(age);
            System.out.println("Xin mời bạn bỏ phiếu");
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}

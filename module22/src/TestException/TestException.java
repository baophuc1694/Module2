package TestException;

public class TestException {
    public static void main(String[] args) {
        try {
            try {
                System.out.println("Thực hiện phép chia");
                int b = 39 / 0;
            }catch (ArithmeticException e){
                System.out.println(e);
            }
            try {
                int a[] = new int[5];
                a[5] = 4;
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
            System.out.println("Khối lệnh khác");
        }catch (Exception e){
            System.out.println("xử lý ngoại lệ");
        }
        System.out.println("Tiếp tục chương trình");
    }
}

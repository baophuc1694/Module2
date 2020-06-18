package introductionJava.MyStack;

public class StackClient {
    public static void main(String[] args) throws Exception {
        MyStack stack = new MyStack(5);
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("1. Kích thước của ngăn xếp sau khi đẩy lên: " + stack.size());
        System.out.println("2. Yếu tố từ ngăn xếp: ");
        while (!stack.isEmpty()){
            try {
                System.out.printf("%d", stack.pop());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("\n.Kích thước của ngăn xếp sau khi pop: " + stack.size());
    }
}

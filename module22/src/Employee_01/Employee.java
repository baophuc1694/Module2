package Employee_01;

public class Employee {
    static String name = "Dev Java";
    public static void changeName(){
        name = "Dev Java Cript";
    }
    public void getName(){
        System.out.println(name);
    }
// Từ khoá this bà super k thể dùng trong ngữ cảnh static.....
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.changeName();
        employee.getName();
    }
}

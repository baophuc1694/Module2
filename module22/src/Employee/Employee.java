package Employee;

public class Employee {
    static String name = "Dev Java";
    public void getPart(){
        System.out.println(name);
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.getPart();
    }
}

package People_02;

public class Employee extends People {
    void printName(){
        System.out.println(super.name);
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.printName();
    }
}

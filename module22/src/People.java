public class People {
    public static void run(){
        System.out.println("Running...");
    }
    static class  Employee extends People{
        public void work(){
            System.out.println("Working...");
        }
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.run();
        employee.work();
    }
}

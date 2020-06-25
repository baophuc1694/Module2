package Studen_02;

public class Student {
    int id;
    String name;
    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }
    void display(){
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Student s1 = new Student(1, "Phuc");
        Student s2 = new Student(2, "Hai");
        s1.display();
        s2.display();
    }
}

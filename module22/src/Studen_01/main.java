package Studen_01;


import java.util.*;

public class main {
    private static List<Student> lists;

    public static void main(String[] args) {
        Student student = new Student("Quoc", 30, "DN");
        Student student1 = new Student("Toan", 26, "QN");
        Student student2 = new Student("Hai", 38, "HN");
        Student student3 = new Student("Scalet", 38, "DN");
        List<Student> list = new ArrayList<Student>();
        list.add(student);
        list.add(student1);
        list.add(student2);
        list.add(student3);
        Collections.sort(list);
        for (Student st: list){
            System.out.println(st.toString());
        }
        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists,ageComparator);
        System.out.println("So sanh theo tuoi");
        for (Student st: lists){
            System.out.println(st.toString());
        }


    }
}

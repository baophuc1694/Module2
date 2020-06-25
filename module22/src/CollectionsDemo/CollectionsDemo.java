package CollectionsDemo;

import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {
        List a1 = new ArrayList();
        a1.add("Phuc");
        a1.add("Phuong");
        a1.add("Phong");
        System.out.println("Cac phan tu ArrayList:");
        System.out.println("\t" + a1);

        List l1 = new LinkedList();
        l1.add("Phuc");
        l1.add("Phuong");
        l1.add("Phong");
        System.out.println();
        System.out.println("Cac phan tu LinkedList:");
        System.out.println("\t" + l1);

        Set s1 = new HashSet();
        s1.add("Phuc");
        s1.add("Phuong");
        s1.add("Phong");
        System.out.println();
        System.out.println("Cac phan tu Set:");
        System.out.println("\t" + s1);

        Map m1 = new HashMap();
        m1.put("Phuc", "26");
        m1.put("Phuong", "24");
        m1.put("Phong", "1");
        m1.put("Nhu Y", "2");
        System.out.println();
        System.out.println("Cac phan tu Map:");
        System.out.println("\t" + m1);

    }
}

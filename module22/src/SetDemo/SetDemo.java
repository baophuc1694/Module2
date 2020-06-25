package SetDemo;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        int count[] = {34, 22, 10, 60, 30, 22};
        Set set = new HashSet();
        try {
            for (int i = 0; i < count.length; i++){
                set.add(count[i]);
            }
            System.out.println(set);
            TreeSet sortedSet = new TreeSet(set);
            System.out.println("Danh sach da qa sap xep la: ");
            System.out.println(sortedSet);
            System.out.println("Phan tu dau tien cua tap hop la: " + (Integer)sortedSet.first());
            System.out.println("Phan tu cuoi cung cua tap hop la: " + (Integer)sortedSet.last());

        }
        catch (Exception e){}
    }
}

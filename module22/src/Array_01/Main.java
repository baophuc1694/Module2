package Array_01;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] years = new int[] {1994, 1996, 2022};
        Arrays.sort(years);
        for (int year: years) {
            System.out.println("Year: " + year);
            
        }
        String yearsString = Arrays.toString(years);
        System.out.println("Years: " + yearsString);
        List<String> names = Arrays.asList("Phuc", "Phuong", "Phuoc");
        for (String name : names) {
            System.out.println("Name: " + name);
        }
    }
}

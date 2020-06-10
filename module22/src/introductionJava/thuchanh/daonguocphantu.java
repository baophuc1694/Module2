package introductionJava.thuchanh;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class daonguocphantu {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        for (int i = 0; i < array.length / 2; i++) {
            int c = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = c;
        }
        System.out.println(array);
        for (int i =0; i < array.length; i++){
            System.out.print(array[i] + "\t");
        }
    }
}

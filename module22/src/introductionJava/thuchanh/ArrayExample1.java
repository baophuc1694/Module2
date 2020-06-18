package introductionJava.thuchanh;

public class ArrayExample1 {
    public static void main(String[] args) {
        int[] myArray =new int[5];
        myArray[0] = 10;
        myArray[1] = 14;
        myArray[2] = 36;
        myArray[3] = 27;
        myArray[4] = 18;
        System.out.println("Array Lenght : " + myArray.length);
        System.out.println("myArray[3] = " + myArray[3]);
        for (int index = 0; index < myArray.length; index++){
            System.out.println("Element" + index + "=" + myArray[index]);
        }
    }
}

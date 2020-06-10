package introductionJava.thuchanh;

public class giatrinhonhat {
    public static int minValue(int[]array){
     return -1;
    }

    public static void main(String[] args) {
        int []arr = {4, 12, 7, 8, 1, 6, 9};
        int index = minValue(arr);
        System.out.println("Giá trị nhỏ nhất trong mảng là: " + arr[index]);
    }
}

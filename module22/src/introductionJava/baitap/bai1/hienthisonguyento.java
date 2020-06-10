package introductionJava.baitap.bai1;
import java.util.Scanner;
public class hienthisonguyento {
    public static boolean isPrimeNumber(int n){
        int uoc=0;
        for (int i = 1; i <=n ; i++) {
            if(n%i==0){
                uoc++;
            }
        }
        if(uoc==2){
            return true;
        }
        else return false;
    }
    public static void main(String[] args) {
        System.out.print("Nhập n = ");
        int n = new Scanner(System.in).nextInt();
        System.out.printf("%d số nguyên tố đầu tiên là: \n", n);
        int dem = 0; // đếm số số nguyên tố
        int i = 2;   // tìm số nguyên tố bắt dầu từ số 2
        while (dem < n) {
            if (isPrimeNumber(i)) {
                System.out.print(i + " ");
                dem++;
            }
            i++;
        }
    }
}


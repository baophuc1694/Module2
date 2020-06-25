package introductionJava;

import java.util.Scanner;

public class Main {
//    public void printHelloWorld(){
//        String string = "HelloWorld!";
//        System.out.println(string);
//    }
//
//    public static void main(String[] args) {
//        Main main = new Main();
//        main.printHelloWorld();
//    }
public static void main(String[] args) {
//    int i =0;
//    while (i < 5){
//        System.out.println("Vị trí thứ: " + i);
//        i++;
//    }




//    int i = 0;
//    do {
//        System.out.println("Vị trí thứ: " + i);
//        i++;
//    }while (i < 5);
//    for (int i =0; i < 5; i++){
//        System.out.println("Vị trí thứ: " + i);
//    }




//    int number =5;
//    if (number < 10){
//        System.out.println("Số đã cho nhỏ hơn 10");
//    }else{
//        System.out.println("Số đã cho lớn hơn 10");
//    }





//    Scanner nhap = new Scanner(System.in);
//    int number;
//    System.out.println("Nhập number: ");
//    number = nhap.nextInt();
//    if (number < 10){
//        System.out.println("Nhỏ hơn 10 ");
//    }else {
//        System.out.println("Lớn hơn 10");
//    }



//    int number = 5;
//    for (int i = 0; i < number; i++){
//        System.out.println("Vị trí thứ: " + i);
//        if (i == 3) break;
//
//    }



//    for ( int i = 0; i < 10; i++){
//        if (i % 3 != 0)
//            continue;
//        System.out.println(i);
//    }



//    String str1 = "Nu, bakachi";
//    String str2 = new String("Nu, bakachi.");
//    System.out.println(str1.equals(str2));
//    System.out.println(str2.equalsIgnoreCase(str2));


//    String str1 = "Nu, bakachi";
//    String str2 = str1;
//    String str3 = new String("Nu, bakachi");
//    System.out.println(str1==str2);
//    System.out.println(str1==str3);

//trả về 0 khi 2 chuỗi đó bằng nhau
    //trả về số dương khi chuỗi s1  lớn hơn chuỗi s3
    //trả về số âm khi s1  nhỏ hơn  chuỗi s3
    //compareTo sẽ so sánh ký tự của 2 chuỗi, nếu chuỗi 1 là 10 ký tự và chuỗi 2 là 8 ký tự thì
    //nó sẽ so sánh độ dài và lấy phần còn dư để cho ra kết quả số dương hoặc âm (str1= 10 - str3 = 8 thì sẽ là dương 2)
//    String str1 = "CodeGymF";
//    String str2 = str1;
//    String str3 = new String("CodeGymFFF");
//    System.out.println(str1.compareTo(str2));
//    System.out.println(str1.compareTo(str3));



    long startTime = System.currentTimeMillis();
    StringBuffer sb = new StringBuffer("Java");
    for (int i = 0; i < 1000000; i++){
        sb.append("CodeGym");
    }
    System.out.println("Thoi gian tieu ton boi StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");
    startTime = System.currentTimeMillis();
    StringBuilder sb2 = new StringBuilder("Java");
    for (int i = 0; i < 100000; i++){
        sb2.append("CodeGym");
    }
    System.out.println("Thoi gian tieu ton boi StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");
}
}

package introductionJava.MyQueue;

public class MyQueue {
    private int capacity;
    private int queueArr[];
    private int head = 0;
    private int tail = -1;
    private int currentSize = 0;
    public MyQueue(int queueSize){
        this.capacity = queueSize;
        queueArr = new int[this.capacity];
    }
    public boolean isQueueEmpty(){
        boolean status = false;
        if (currentSize ==0){
            status = true;
        }
        return status;
    }
    public void enqueue(int item){
        if (isQueueEmpty()){
            System.out.println("Tràn! Không thể thêm phần tử: " + item);
        }else {
            tail++;
            if (tail == capacity -1){
                tail = 0;
            }
            queueArr[tail] = item;
            currentSize++;
            System.out.println("Phần tử" + item + "Được đẩy đến hàng đợi");
        }
    }
    public void dequeue(){
        if (isQueueEmpty()){
            System.out.println("Tràn! không thể xoá phần tử");
        }else {
            head++;
            if (head == capacity - 1){
                System.out.println("Hoàn tất! đã loại bỏ: " + queueArr[head - 1]);
                head = 0;
            }else {
                System.out.println("Hoàn tất! đã loại bỏ: " + queueArr[head -1]);
                currentSize++;
            }
        }
    }
}

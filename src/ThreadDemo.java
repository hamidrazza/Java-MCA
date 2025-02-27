class MyThread extends Thread{
    public void run(){
        String str = "My thread is starting...";
        System.out.println(str);
    }
}
public class ThreadDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        // to start the thread
        t1.start();
    }
}

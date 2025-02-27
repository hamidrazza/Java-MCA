class Demo implements Runnable{
    
    public void run(){
        try {
            Thread.sleep(102);
        } catch (InterruptedException ie1) {
            ie1.printStackTrace();
        }

        System.out.println("The state for t1 after it invoked join method() on thread t2" + " " + ThreadState.t1.getState());

        try {
            Thread.sleep(202);
        } catch (InterruptedException ie2) {
            ie2.printStackTrace();
        }
    }
}

// Creating of ThreadState class
public class ThreadState implements Runnable{
    public static Thread t1;
    public static ThreadState ts1;

    public void run(){
        Demo dem = new Demo();
        Thread t2 = new Thread(dem);

        t2.start();

        System.out.println("State of t2 Thread, post-calling of start() method is " + " " + t2.getState());

        try{
            t2.sleep(202);
        }
        catch(InterruptedException ie2){
            ie2.printStackTrace();
        }

        System.out.println("State of t2 Thread, after invoking sleep() method is " + " " + t2.getState());

        try {
            t2.join();
            System.out.println("State of t2, after join() is " + t2.getState());
        } catch (InterruptedException ie3) {
            ie3.printStackTrace();
        }

        System.out.println("State of t1, after completing the execution is " + t1.getState());
    }    

    public static void main(String[] args) {
        ts1 = new ThreadState();
        t1 = new Thread(ts1);

        System.out.println("Post-spanning, state of t1 is " + t1.getState());

        t1.start();

        System.out.println("Post-invoking, state of t1 is " + t1.getState());
    }
}

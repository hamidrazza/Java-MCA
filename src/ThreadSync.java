
class Sender{
    public void send(String msg){
        System.out.println("Sending\t" + msg);
        try{
            Thread.sleep(1000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("\t" + msg + "Sent");
    }
}
class ThreadedSend extends Thread{
    private String msg;
    private Thread th;
    Sender sender;

    ThreadedSend(String msg, Sender send){
        this.msg = msg;
        this.sender = send;
    }
    public void run(){
        // only one thread can send a message at a time
        synchronized (sender){
            // synchronizing the objects
            sender.send(msg);
        }
    }
}
public class ThreadSync{
    public static void main(String[] args) {
        Sender snd = new Sender();
        ThreadedSend t1 = new ThreadedSend("Hello ", snd);
        ThreadedSend t2 = new ThreadedSend("Bye ", snd);

        // Start two thread
        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }
        catch(InterruptedException e){
            System.out.println("Interrupted");
        }
    }
}
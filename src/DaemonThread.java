public class DaemonThread extends Thread{
    DaemonThread(String name){
        super(name);
    }
    public void run(){
        if(Thread.currentThread().isDaemon()){
            System.out.println(getName() + " is Daemon thread.");
        }else{
            System.out.println(getName() + " is User thread.");
        }
    }
    public static void main(String[] args) {
        DaemonThread t1 = new DaemonThread("Hamid");
        DaemonThread t2 = new DaemonThread("Toheed");
        DaemonThread t3 = new DaemonThread("Anas");

        // Setting userThread(t1) to daemonThread
        t1.setDaemon(true);
        // Starting 2 threads
        t1.start();
        t2.start();

        // Setting userThread(t3) to daemonThread
        t3.setDaemon(true);
        t3.start();
    }
}

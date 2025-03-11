public class ThreadPriority extends Thread{
    public void run(){
        System.out.println("Inside the run method");
    }

    public static void main(String[] args) {
        ThreadPriority t1 = new ThreadPriority();
        ThreadPriority t2 = new ThreadPriority();
        ThreadPriority t3 = new ThreadPriority();

        System.out.println("T1 thread priority : " + t1.getPriority());
        System.out.println("T2 thread priority : " + t2.getPriority());
        System.out.println("T3 thread priority : " + t3.getPriority());

        // Using try block bcz Thread.setPriority(11) will throw and Exception
        try{
            t1.setPriority(2);
            t2.setPriority(5);
            t3.setPriority(8);
        }
        catch(IllegalArgumentException e){
            System.out.println("You can't set the priority greater than 10");
        }

        System.out.println("\nT1 thread priority : " + t1.getPriority());
        System.out.println("T2 thread priority : " + t2.getPriority());
        System.out.println("T3 thread priority : " + t3.getPriority());

        // Main Thread
        System.out.println("\n" + Thread.currentThread().getName());
        System.out.println("Main thread priority : " + Thread.currentThread().getPriority());

        // Setting the Main Thread priority
        Thread.currentThread().setPriority(10);
        System.out.println("Main thread priority : " + Thread.currentThread().getPriority());
    }
}

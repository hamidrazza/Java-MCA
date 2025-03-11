class NameDemo extends Thread{
    NameDemo(String name){
        super(name);
    }
    @Override
    public void run(){
        System.out.println("Thread is running.....");
    }
}
public class ThreadName {
    public static void main(String[] args) {
        NameDemo t1 = new NameDemo("Hamid");
        NameDemo t2 = new NameDemo("Anas");

        // Getting the name of threads
        System.out.println("Thread t1 : "+t1.getName());
        System.out.println("Thread t2 : "+t2.getName());

        t1.start();
        t2.start();

        System.out.println("Threads name after setName() method");
        t1.setName("NewName");
        t2.setName("DemoName");

        // Getting the name of threads
        System.out.println("Thread t1 : "+t1.getName());
        System.out.println("Thread t2 : "+t2.getName());
    }
}
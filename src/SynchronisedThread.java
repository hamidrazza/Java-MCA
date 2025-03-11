class Counter{
    private int count = 0;

    // Synchronised method to ensure thread safe
    public synchronized void increment(){
        // Increment the counter
        count++;
    }
    public int getCount(){
        return count;
    }
}

class CounterThread extends Thread{
    private Counter counter;

    CounterThread(Counter counter){
        this.counter = counter;
    }
    @Override
    public void run(){

    }
}

public class SynchronisedThread {

}

/**
 * Created by joel on 3/31/17.
 *
 * contains logic for semaphore operations, with limits bounded by a variable
 * entered by the user
 */
public class Semaphore {
    private int signals = 0;
    private int bound   = 0;

    public Semaphore(int upperBound){
        this.bound = upperBound;
    }

    public synchronized void Wait() throws InterruptedException{
        while(this.signals == bound) wait();
        this.signals++;
        this.notify();
    }

    public synchronized void Signal() throws InterruptedException{
        while(this.signals == 0) wait();
        this.signals--;
        this.notify();
    }
}

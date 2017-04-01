/**
 * Created by joel on 3/31/17.
 */
public class MoleThread extends Thread{
    private Thread t;
    private String moleThread;

    //constructor for threads
    MoleThread(String name){
        moleThread = name;
        System.out.println("Created " + moleThread);
    }

    //runnable method for
    public void run(){
        System.out.println("Running " + moleThread);
        try {
            System.out.println("actually do some stuff now");
            Thread.sleep(1);
        }catch (InterruptedException e){
            System.out.println("Thread " + moleThread + " interrupted");
        }
        System.out.println("Exiting " + moleThread);
    }

    public void start(){
        System.out.println("Started " + moleThread);
        if (t == null){
            t = new Thread(this, moleThread);
            t.start();
        }
    }
}


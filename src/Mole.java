/**
 * Created by joel on 3/31/17.
 *
 * Mole object, consisting of a thread to act on the game logic
 */
public class Mole {

    //constructor for the Mole class
    Mole(String moleName){
        MoleThread thread = new MoleThread(moleName);

        thread.start();
        thread.run();
    }
}

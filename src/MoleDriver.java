import java.util.Scanner;

/**
 * Created by joel on 3/31/17.
 *
 * This will serve to power the logic for the whack-a-mole game.
 * the game's purpose is to use several threads to implement moles and as a result
 * have moles pop up at random intervals in a GUI. It should be scalable with the
 * number of desired moles at any one time and the max number of spaces.
 */

public class MoleDriver {

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter in a board Length");
        int length = sc.nextInt();

        System.out.println("Enter in a board Width");
        int width = sc.nextInt();

        System.out.println("Enter in a maximum concurrent number of moles");
        int numMoles = sc.nextInt();

        Mole moleArray[] = new Mole[numMoles];
        for(int i = 0; i < numMoles; i++){
            moleArray[i] = new Mole("Mole" + i);
        }

        Semaphore moleSemaphore = new Semaphore(numMoles);
    }
}

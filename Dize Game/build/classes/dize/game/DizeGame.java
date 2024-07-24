package dize.game;
import javax.swing.JOptionPane;
import java.util.Random;

/**
 *
 * @author Themba Ntimane Here we will code a dice game using the import random
 * to generate random numbers from 1 to 6
 */
public class DizeGame {

    public static void main(String[] args) {
        Random rand = new Random();          //instance of the random
        int x = rand.nextInt(6) + 1;
        JOptionPane.showMessageDialog(null ,"Dize : " + x);
        if (x== 6 ){ JOptionPane.showMessageDialog(null, "Hehh pop!!!!");}
        else if (x==2 ){ JOptionPane.showMessageDialog(null, "Crap!!");}

        
    }

}

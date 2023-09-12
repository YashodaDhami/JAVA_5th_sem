import java.applet.Applet;
import java.awt.Graphics;
import java.util.Scanner;

public class CheckLength extends Applet {
    public void paint(Graphics g) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a word
        System.out.print("Enter a word: ");
        String word = input.nextLine();

        // Check if the word is of length 5
        if (word.length() == 5) {
            g.drawString("The word is of length 5", 25, 25);
        } else {
            g.drawString("The word is not of length 5", 25, 25);
        }
        input.close();
    }
}
/*
 * <applet CODE="CheckLength.class" WIDTH=800 HEIGHT=800>
 * </applet>
 */

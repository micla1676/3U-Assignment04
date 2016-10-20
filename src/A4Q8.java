
import java.util.Scanner;

/**
 * A4Q8 Snakes & ladders
 *
 * @author micla1676
 */
public class A4Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner
        Scanner input = new Scanner(System.in);

        //create integer to add to dice
        int dice = 1;

        //loop while dice < 100
        while (true) {
            //ask for the sum of the dice
            System.out.println("Enter sum of dice:");

            //store input
            int sum = input.nextInt();

            //quit game
            if (sum == 0) {
                break;
            }

            //if sum is greater then 12, tell user they are a cheater
            if (sum > 12) {
                System.out.println("Cheater");
                dice = dice - sum;
            }
            //add sum to dice
            dice = sum + dice;

            //if square is greater then 100, send them back to old square.
            if (dice > 100) {
                dice = dice - sum;
            }

            //tell user their square number
            System.out.println("You are now on square " + dice);

            //(snake)if user lands of square 54, send them to square 19
            if (dice == 54) {
                dice = 19;
                System.out.println("Sorry, you landed on a snake, and are"
                        + "now on square 19");
            }
            //(snake)if user lands on square 90, send them to square 48
            if (dice == 90) {
                dice = 48;
                System.out.println("Sorry, you landed on a snake, and are"
                        + "now on square 45");
            }
            //(snake) if user lands on square 99, send them to square 77
            if (dice == 99) {
                dice = 77;
                System.out.println("Sorry, you landed on a snake, and are"
                        + " now on square 77");
            }
            //(ladder) if user lands on square 9 send them to square 34.
            if (dice == 9) {
                dice = 34;
                System.out.println("Congratulations, you landed on a ladder"
                        + " and are now on square 34!");
            }
            //(ladder) if user lands on square 40 send them to square 64.
            if (dice == 40) {
                dice = 64;
                System.out.println("Congratulations, you landed on a ladder"
                        + " and are now on square 64!");
            }
            //(ladder) if user lands on square 67 send them to square 86.
            if (dice == 67) {
                dice = 86;
                System.out.println("Congratulations, you landed on a ladder"
                        + " and are now on square 86!");
            }
            //tell user they win and break loop
            if (dice == 100) {
                System.out.println("You Win!");
                break;
            }
        }
    }
}

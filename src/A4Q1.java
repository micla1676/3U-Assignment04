
import java.util.Scanner;

/**
 * A4Q1 program that asks for name
 *
 * @author micla1676
 */
public class A4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create the scanner
        Scanner input = new Scanner(System.in);

        //ask user for their name
        System.out.println("Please Enter your name:");

        //get the name from the user
        String name = input.nextLine();

        System.out.println("Hello " + name + ". How are you today?");
    }
}

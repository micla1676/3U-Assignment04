
import java.util.Scanner;

/**A4Q3
 * display 4 user generated numbers
 * @author micla1676
 */
public class A4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner
        Scanner input = new Scanner(System.in);
        
        //ask for 4 inputs from the user
        System.out.println("Please enter in 4 numbers on seperate lines:");
        
        //store user input 1
        double real1 = input.nextDouble();
        
        //store user input 2
        double real2 = input.nextDouble();
        
        //store user input 3
        double real3 = input.nextDouble();
        
        //store user input 4
        double real4 = input.nextDouble();
        
        //display user inputs
        System.out.println("Your numbers were " + real1 + "," + real2 + "," + 
                real3 + "," + real4 + ".");
        
    }
}

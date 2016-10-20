
import java.util.Scanner;

/**A4Q5
 * Average calculator
 * @author micla1676
 */
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner
        Scanner input = new Scanner (System.in);
        
        //ask for name
        System.out.println("Please enter your name?:");
        
        //get the name from the user
        String name = input.nextLine();
        
        
        
        //ask for total of first test
        System.out.println("What was the first test out of?:");
        
        //get the total from the first test
        int TTestOne = input.nextInt();
        
        //ask for mark of first test
        System.out.println("What mark did you get?:");
        
        //get the mark from the first test
        double MTestOne = input.nextInt();
        
        
        
        //ask for total of second test
        System.out.println("What was the second test out of?:");
        
        //get the total from the second test
        int TTestTwo = input.nextInt();
        
        //ask for mark of second test
        System.out.println("What mark did you get?:");
        
        //get the mark from the second test
        double MTestTwo = input.nextInt();
        
        
        
        //ask for total of third test
        System.out.println("What was the third test out of?:");
        
        //get the total from the third test
        int TTestThree = input.nextInt();
        
        //ask for mark of third test
        System.out.println("What mark did you get?:");
        
        //get the mark from the third test
        double MTestThree = input.nextInt();
        
        
        
        //ask for total of fourth test
        System.out.println("What was the fourth test out of?:");
        
        //get the total from the fourth test
        int TTestFour = input.nextInt();
        
        //ask for mark of fourth test
        System.out.println("What mark did you get?:");
        
        //get the mark from the fourth test
        double MTestFour = input.nextInt();
        
        
        
        //ask for total of fifth test
        System.out.println("What was the fifth test out of?:");
        
        //get the total from the fifth test
        int TTestFive = input.nextInt();
        
        //ask for mark of fifth test
        System.out.println("What mark did you get?:");
        
        //get the mark from the fifth test
        double MTestFive = input.nextInt();
        
        
        
        //calculate averages
        double test1 = MTestOne / TTestOne ;
        double test2 = MTestTwo / TTestTwo ;
        double test3 = MTestThree / TTestThree ;
        double test4 = MTestFour / TTestFour ;
        double test5 = MTestFive / TTestFive ;
        
        double total = (test1 + test2 + test3 + test4 + test5) / 5;
        
        //display averages 
        System.out.println(" ");
        System.out.println("Test Scores for " + name);
        
        System.out.println("Test 1: " + test1 +"%");
        System.out.println("Test 2: " + test2 +"%");
        System.out.println("Test 3: " + test3 +"%");
        System.out.println("Test 4: " + test4 +"%");
        System.out.println("Test 5: " + test5 +"%");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Average:" + total + "%");
    }
}

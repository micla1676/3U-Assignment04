
import java.util.Scanner;

/**
 * A4Q2 convert from cm to inches
 *
 * @author micla1676
 */
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the measurement in inches you wish to "
                + "convert:");

        int userinput = input.nextInt();

        double output = userinput * 2.54;

        System.out.println(userinput + " inches is the same as " + output
                + " cm");

    }
}


import java.util.Scanner;

/** A4Q4
 * Calculate Costs
 * @author micla1676
 */
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner
        Scanner input = new Scanner (System.in);
        
        //ask for cost of food
        System.out.println("How much does the food for prom cost?");
        
        //store entered number
        double food = input.nextDouble();
        
        //ask for cost of DJ
        System.out.println("How much does the DJ cost?");
        
        //store entered number
        double DJ = input.nextDouble();
        
        //ask for cost of hall
        System.out.println("How much does it cost to rent the hall?");
        
        //store entered number
        double hall = input.nextDouble();
        
        //ask for cost of decorations
        System.out.println("How much does decorations cost?");
        
        //store entered number
        double decorations = input.nextDouble();
        
        //ask for cost of staff
        System.out.println("How much does it cost for staff?");
        
        //store entered number
        double staff = input.nextDouble();
        
        //ask for miscellaneous costs
        System.out.println("How much for miscellaneous costs?");
        
        //store entered number
        double miscellaneous = input.nextDouble();
        
        double total = food + DJ + hall + decorations + staff + miscellaneous;
        
        total = Math.ceil(total);
        
        double tickets = total / 35;
        
        tickets = Math.ceil(tickets);
        
        System.out.println("The total cost is $" + total + ". You will need to"
                + " sell " + tickets + " tickets to break even.");
    }
}

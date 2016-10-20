
import java.util.Scanner;

/**A4Q7
 * Radar signs
 * @author micla1676
 */
public class A4Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create Scanner
        Scanner input = new Scanner (System.in);
        
        //ask user for speed limit
        System.out.println("Enter the speed limit:");
        
        //store speed limit
        int limit = input.nextInt();
        
        //ask for recorded speed of car
        System.out.println("Enter the recorded speed of the Car:");
        
        //store user speed 
        int speed = input.nextInt();
        
        //if driver is less them or equal to limit, tell them
        if(speed <= limit){
            System.out.println("Congratulations, you are within "
                    + "the speed limit!");
        }
         //if driver is speeding less then 20km over the limit. tell them
        if (speed > limit){
            if(speed - limit <= 20){
                System.out.println("You are speeding and your fine is $100");
            }
            
             //if driver is speeding 21-30 or more over the limit. tell them
            else if (speed - limit >= 21 && speed - limit <= 30){
                System.out.println("You are speeding and your fine is $270");         
            }
            
            //if driver is speeding 31km or more over the limit. tell them.
            else if(speed - limit >= 31){
                System.out.println("You are speeding and your fine is $500");
            }
            
            
            
            
            
            
        }
    }
}

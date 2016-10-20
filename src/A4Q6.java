
import java.util.Scanner;

/**A4Q6
 * 
 * @author micla1676
 */
public class A4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner
        Scanner input = new Scanner (System.in);
        
        //ask for amount of daytime minutes
        System.out.println("Number of daytime minutes?");
        //store daytime minutes
        int daytime = input.nextInt();
        
        
        //ask for amount of evening minutes
        System.out.println("Number of evening minutes?");
        //store evening minutes
        int evening = input.nextInt();
        
        
        //ask for amount of weekend minutes
        System.out.println("Number of weekend minutes?");
        //store weekend minutes
        int weekend = input.nextInt();
        
        
        //plan A
        
        //remove free minutes from Daytime
        double Dplan1 = daytime - 100;
        //if Daytime minutes are greater then 0, multiply by 0.25
        if (Dplan1 > 0){
            Dplan1 = Dplan1 * 0.25;
        }else{
            Dplan1 = 0;
        }
        
        //calculate evening costs
        double Eplan1 = evening * 0.15;
        
        //calculate weekend costs 
        double Wplan1 = weekend * 0.2;
        
        //calculate total cost for plan 1
        double totalA= Dplan1 + Eplan1 + Wplan1;
        
        
        //round to the nearest tenth
        //multiply be 100
        totalA = totalA * 100;
        //round to nearest number
        totalA = Math.round(totalA);
        //divide by 100
        totalA = totalA / 100;
        
        
        //Plan B
        
        //remove free minutes from Daytime
        double Dplan2 = daytime - 250;
        //if Daytime minutes are greater then 0, multiply by 0.45
        if (Dplan2 > 0){
            Dplan2 = Dplan2 * 0.45;
        }else{
            Dplan2 = 0;
        }
        
        //calculate evening costs
        double Eplan2 = evening * 0.35;
        
        //calculate weekend costs
        double Wplan2 = weekend * 0.25;
        
        //calculate total costs for plan 2
        double totalB= Dplan2 + Eplan2 + Wplan2;
        
        //round to the nearest tenth
        //multiply be 100
        totalB = totalB * 100;
        //round to nearest number
        totalB = Math.round(totalB);
        //divide by 100
        totalB = totalB / 100;
        
        //print costs
        System.out.println("Plan A costs " + totalA);
        System.out.println("Plan B costs " + totalB);
        
        //say plan B is cheaper
        if(totalA > totalB){
            System.out.println("Plan B is cheaper.");
        }
        
        //say plan A is cheaper
        if(totalA < totalB){
            System.out.println("Plan A is cheaper.");
        }
            
        //say plan A & B are equal price
        if(totalA == totalB){
            System.out.println("Plan A & B are the same price.");
        }
        
        
    }
    }


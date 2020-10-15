
package bab3.ch8;

import java.util.*;

public class ConditionalStatements {
    
    public static void main(String[] args){

        int target = 3;
        String performance = "";
        double bonus;
        
        Scanner in = new Scanner(System.in); //Inisiasi objek
        
        
        System.out.print("Insert your sales: ");
        int yourSales = in.nextInt();
        
        if (yourSales >= 2 * target)
        {
            performance = "Excellent";
            bonus = 1000;
            System.out.printf("%s , %f\n", performance,bonus);
        }
        else if (yourSales >= 1.5 * target)
        {
            performance = "Fine";
            bonus = 500;
            System.out.printf("%s , %f\n", performance,bonus);
        }
        else if (yourSales >= target)
        {
            performance = "Satisfactory";
            bonus = 100;
            System.out.printf("%s , %f\n", performance,bonus);
        }
        else
        {
           System.out.println("You're fired\n");
           }
    }
}

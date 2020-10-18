
package bab3.ch8;

import java.util.*;

public class BreakFlow {
    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("How much money do you need to retire?");
        double goal = in.nextDouble();
        
        System.out.print("How much money will you contribute every year? ");
        double payment = in.nextDouble();
        
        System.out.print("Interest rate in %: ");
        double interestRate = in.nextDouble();
        
        double balance = 0;
        int years = 0;
        
        //Break Flow
        
        while (years <= 100)
        {
        balance += payment;
        double interest = balance * interestRate / 100;
        balance += interest;
        if (balance >= goal) break;
        years++;
       
        }
        System.out.println(" In " + years + " years, You will have : " + balance);
        
        //Continue Flow
        
        int count,n ,sum = 0;
        
        for (count = 1; count <= 100; count++)
        {
         System.out.print("Enter a number, -1 to quit: ");
         n = in.nextInt();
         if (n < 0) continue;
         sum = sum + n; // not executed if n < 0
        }
        System.out.println("Sum " + sum);
    }
    
}

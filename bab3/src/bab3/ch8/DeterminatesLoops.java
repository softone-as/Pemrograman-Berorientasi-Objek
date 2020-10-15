
package bab3.ch8;

import java.util.*;

public class DeterminatesLoops {
    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("How many numbers do ou need to draw? ");
        int k = in.nextInt();
        
        System.out.print("What is the highest number you can draw? ");;
        int n = in.nextInt();
        
        /*
        * compute binomial coefficient n*(n-1)*(n-2)*...*(n-k+1)/(1*2*3*...*k)
        */
        
        int lotteryOdds = 1;
        for(int i = 1; i <= k; i++){
            lotteryOdds = lotteryOdds * (n - i + 1) / i;
            
            System.out.println("Your odds are 1 in2" + lotteryOdds + ". Good luck!");
        }
    }
    
}

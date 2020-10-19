
package bab3.ch10;

import java.util.*;

public class InitializesAndAnonymousArrays {
    
    public static void main(String[] args){
        
        int[] smallPrimes = { 2, 3, 5, 7, 11, 13 };
        
        for (int element : smallPrimes)
        System.out.println(element);
        
        System.out.println(" ");
        System.out.println("Reinitialize : ");
        
        smallPrimes = new int[] { 17, 19, 23, 29, 31, 37 };
        System.out.println(Arrays.toString(smallPrimes));
    }
    
}

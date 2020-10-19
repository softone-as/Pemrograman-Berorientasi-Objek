
package bab3.ch10;

import java.util.*;

public class ArrayCopying {
    
    public static void main(String[] args){
        
        //both arrays will have the same value because they have same pointer
        int[] smallPrimes = new int[] {12,25,24,54};
        int[] luckyNumber = smallPrimes;
        luckyNumber[2] = 100;
        System.out.println(Arrays.toString(smallPrimes));
        
        System.out.println("=================");
        
        //initialize new array
        int[] copiedNumber = luckyNumber;
        System.out.println(Arrays.toString(copiedNumber));
        
        //copy value
        copiedNumber = Arrays.copyOf(luckyNumber, 2);
        System.out.println(Arrays.toString(copiedNumber));
    }
    
}


package bab3.ch8;

import java.util.*;


public class MultipleSelectionSwitch {
    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Select an option (1, 2, 3, 4) : ");
        int choice = in.nextInt();
        
        switch (choice)
        {
        case 1:
        System.out.println("You're choose 1");
        break;
        case 2:
        System.out.println("You're choose 2");
        break;
        case 3:
        System.out.println("You're choose 3");
        break;
        case 4:
        System.out.println("You're choose 4");
        break;
        default:
        // bad input
        System.out.println("You're insert wrong number");
        break;
        }
        
        
    }
    
}


package bab3.ch5;


public class CombiningAssignmentwOperators {
    
    public static void main(String[] args){
        int x = 0;
        int z;
                
        x += 4; // same meaning x = x + 4
        
        z = (int)(x + 3.5); // if the type is different
        
        System.out.println(x);
        System.out.println(z);
    }
    
}

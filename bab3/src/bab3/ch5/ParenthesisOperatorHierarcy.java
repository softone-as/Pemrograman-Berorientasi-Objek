
package bab3.ch5;


public class ParenthesisOperatorHierarcy {
    
    public static void main(String[] args){
        int a = 2;
        int b = 3;
        int c = 4;
        
        a += b += c; // a += (b += c)
        
        System.out.println(a);
    }
        
    
}


package bab3.ch5;


public class IncrementsDecrementsOperator {
    
    public static void main(String[] args){
        int m = 7;
        int n = 7;

        int a = 2 * ++m; // now a is 16, m is 8
        int b = 2 * n++; // now b is 14, n is 8
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(n);
        System.out.println(m);
    }
    
}


package bab3.ch6;


public class StringAPI {
    
    public static void main(String[] args){
        String s1 = "Soft one";
        String s2 = "Shy hab";
        boolean result;
        
        int n1 = s1.length();
        int n2 = s2.length();
        char first = s1.charAt(0);
        result = s1.equals(s2);
        
        System.out.println(first);
        System.out.println(n2);        
        System.out.println(result);
    }
    
}


package bab3.ch6;


public class StringAreImmutable {
    
    
       
    public static void main(String[] args) {
        String greet = "Hello";
        greet = greet.substring(0,3) + "p!";
        
        String s = "Sahabat";
        s = s.substring(0,0) + "Manchunian";
        
        System.out.println(greet);
        System.out.println(s);
    }

  }
    


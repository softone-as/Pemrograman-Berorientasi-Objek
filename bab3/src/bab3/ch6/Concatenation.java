
package bab3.ch6;


public class Concatenation {
    
    public static void main(String[] args){
        String expletive = "Expletive";
        String PG13 = "deleted";
        String message = expletive + PG13; //+ is not doesn't include space
        
        System.out.println(message);
        
        int age = 13;
        String rating = "PG" + age; // + can use for concatenating two data types which is different
        
        System.out.println(rating);
        
        String all = String.join(" / ", "S", "M", "L", "XL"); // all is the string "S / M / L / XL"
        
        System.out.println(all);
    }
    
}

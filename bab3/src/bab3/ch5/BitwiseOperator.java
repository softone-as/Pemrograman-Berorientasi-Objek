
package bab3.ch5;


public class BitwiseOperator {
    
    public static void main(String[] args){
        
        int a = 3; //00000011
        int b = 24; //00011000
        int c = 12; //00001100
        int result1, result2, result3, result4, result5, result6;
        
        //Shift Left
        result1 = (a << 3); //00011000 = 24
        
        //Shift Right
        result2 = (b >> 2);//00000110 = 6
        
        //Or
        result3 = (b | c); //00011100 = 20 
        
        //And
        result4 = (b & c); //00001000 = 8
        
        //XOR
        result5 = (b ^ c); //00010100 = 20
        
        //NOT
        result6 = (~b); // 00011000 = ~25
        
        System.out.println("a << 3 = " + result1);
        System.out.println("b >> 2 = " + result2);
        System.out.println("b | c = " + result3);
        System.out.println("b & c = " + result4);
        System.out.println("b ^ c = " + result5);
        System.out.println("~b = " + result6);
    }
    
}

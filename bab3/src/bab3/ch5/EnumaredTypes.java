
package bab3.ch5;


public class EnumaredTypes {
    
//    enum Size { SMALL, MEDIUM, LARGE, EXTRA_LARGE }; // enum can be method too, and warning will disapear
    
    public static void main(String[] args){
        enum Size { SMALL, MEDIUM, LARGE, EXTRA_LARGE };
        
        Size s = Size.MEDIUM;
        
        System.out.println(s);
    }
}

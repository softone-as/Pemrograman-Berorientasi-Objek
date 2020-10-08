
package bab3.ch4;


public class InitializingVariables {
    
    public static void main(String[] args){
        int myAge = 20;
        boolean itsTrue = false;
        char itsRight = 'Y';
        float money = 20000.87f;
        
        System.out.println("are you 19 yo ?");
        if(myAge == 19){
            itsTrue = true;
            
            System.out.println(itsRight);
            System.out.println(itsTrue);
            
        }else{
            itsTrue = false;
            itsRight = 'N';
            System.out.println(itsRight);
            System.out.println(itsTrue);
            System.out.println("my age is " + myAge);
            System.out.println("You're wrong, you should paid me "+money);
        }
    }
}

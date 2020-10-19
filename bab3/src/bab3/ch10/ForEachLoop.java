
package bab3.ch10;


public class ForEachLoop {
    
    public static void main(String[] args){
        int[] a = {1,2,3,4,5};
        
        for (int element : a)
        System.out.println(element);
        
        System.out.println("======");
        
        for (int i = 0; i < a.length; i++)
        System.out.println(a[i]);
    }
    
}

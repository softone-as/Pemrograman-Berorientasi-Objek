
package ch1;


public class Object {
    //instance field
    private int data;
    private String nameData;
    
    //methods
    public int getData(){
        return data;
    }
    
    public void setData(int data) {
        this.data = data;
    }
    
    public static void main(String args[]){
        Object object = new Object();
        
        object.setData(5);
        System.out.println(object.getData());
    }
}

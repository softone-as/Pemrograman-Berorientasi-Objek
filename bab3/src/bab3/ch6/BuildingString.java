
package bab3.ch6;


public class BuildingString {

        public static void main(String[] args){
            
        StringBuilder builder = new StringBuilder(); //Membuat objek builder
        String s;
        builder.append('y');
        builder.append(" ada yg bisa saya bantu?");
        s = builder.toString();
        System.out.println(s);

    }
    
}

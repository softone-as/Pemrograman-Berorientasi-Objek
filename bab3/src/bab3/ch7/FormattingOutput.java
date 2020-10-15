
package bab3.ch7;



public class FormattingOutput {
    
    public static void main(String[] args){
        
        String name = "Shofwan";
        int age = 20;
        
        System.out.printf("Hello %s. Next year, you'll be %d \n", name, age+1);
        
        //ada tanda seperti , bisa digunakan untuk mengontrol bagaimana kita menginginkan suatu tampilan saat diprint
        System.out.printf("%,.2f \n", 10000.0 / 3.0);
        
        //membuat format string tanpa menampilkan di layar
        String message = String.format("Hello, %s. Next year you'll be %d", name, age+1);
        
        System.out.println(message);
    }
    
}

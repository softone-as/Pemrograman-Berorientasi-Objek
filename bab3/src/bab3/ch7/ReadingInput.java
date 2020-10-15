

package bab3.ch7;

import java.util.Scanner;


public class ReadingInput {
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in); //Inisiasi objek
        
        //first input
        System.out.print("What is your name? ");
        String name = in.nextLine();
        
        //second input
        System.out.print("How old are you? ");
        int age = in.nextInt();
        
        //display output
        System.out.println("Hello, "+ name + ". Next year, you'll be " + (age + 1));


    }
}

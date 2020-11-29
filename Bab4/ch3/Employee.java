
package ch3;

import java.time.*;

public class Employee {
     // instance fields
     private static int nextId = 1; // static fields
     private int id = getNextId();
     private String name;
     private double salary;
     private LocalDate hireDay;
     private final String company = "Syihab Company";  //Final Instance field
     
    // constructor 
     public Employee(String n, double s, int year, int month, int day)
     {
        name = n;
        salary = s;
        hireDay = LocalDate.of(year, month, day);
     }
     
     // a method
     public String getName(){
        return name;
     }
     
     public double getSalary(){
         return salary;
     }
     
     public static int getNextId(){
          return nextId;
     }
     
     public LocalDate getHireDay(){
         return hireDay;
     }
     
     private void setId(){
          id = nextId;
          nextId++;
     }
     
     //this method can call private data salary from this class
     public void raiseSalary(double byPercent){
         double raise =  salary * byPercent/100;
         salary += raise;
     }
    
     public String toString(){
          String data;
        data = "Id: " + this.id + "\n";
        data += "Name: " + this.name + "\n";
        data += "Salary: " + this.salary + "\n";
        data += "Hire-day: " + this.hireDay + "\n";
        data += "Company: " + this.company + "\n";

        return data;
    }
}

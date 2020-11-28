
package ch3;

import java.time.*;

public class Employee {
     // instance fields
     private String name;
     private double salary;
     private LocalDate hireDay;
     
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
     
     public LocalDate getHireDay(){
         return hireDay;
     }
     
     //this method can call private data salary from this class
     public void raiseSalary(double byPercent){
         double raise =  salary * byPercent/100;
         salary += raise;
     }
    
}

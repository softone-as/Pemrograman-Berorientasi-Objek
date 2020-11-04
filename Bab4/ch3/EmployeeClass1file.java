
package ch3;

import java.time.*;

public class EmployeeClass1file {    
    public static void main(String args[]){
        // fill the staff array with three Employee objects
        Employee1[] staff = new Employee1[3];
        
        staff[0] = new Employee1("Carl Cracker", 75000, 1987, 12, 15 );
        staff[1] = new Employee1("Harry Hacker", 50000, 1989, 10, 1 );
        staff[2] = new Employee1("Tony Tester", 40000, 1990, 3, 15 );
        
        // raise everyone's salary by 5%
        for (Employee1 e : staff )
            e.raiseSalary(5);
        
        // print out information about all Employee objects
        for (Employee1 e : staff)
            System.out.println("name = " + e.getName() + ", salary = " + e.getSalary() + 
                    ", hireDay = "+e.getHireDay());
    }
}

class Employee1 {
     // instance fields
     private String name;
     private double salary;
     private LocalDate hireDay;
     
    // constructor 
     public Employee1(String n, double s, int year, int month, int day)
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
     
     public void raiseSalary(double byPercent){
         double raise =  salary * byPercent/100;
         salary += raise;
     }    
}


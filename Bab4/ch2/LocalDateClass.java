
package ch2;

import java.time.LocalDate;
public class LocalDateClass {
    
    public static void main(String args[]){
        LocalDate newYearsEve = LocalDate.of(1999, 12, 31);
        
        int year = newYearsEve.getYear();
        int month = newYearsEve.getMonthValue();
        int day = newYearsEve.getDayOfMonth();
        
        System.out.println("Current time is : "+day+" "+month+" "+year);
        
        LocalDate aThousandDaysLater = newYearsEve.plusDays(1000);
        year = aThousandDaysLater.getYear(); // 2002
        month = aThousandDaysLater.getMonthValue(); // 09
        day = aThousandDaysLater.getDayOfMonth(); // 26
        
        System.out.println("a Thousand Days Later : "+day+" "+month+" "+year);        
    }
}
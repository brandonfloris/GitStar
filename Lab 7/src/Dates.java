import java.util.Scanner;

public class Dates {
    public static void main(String[] args) {
        int month, day, year; // date read in from user
        int daysInMonth; // number of days in month read in
        boolean monthValid = false, yearValid = false, dayValid = false; // true if input from user is
                                                 // valid
        boolean leapYear = false; // true if user's year is a leap year
        Scanner scan = new Scanner(System.in);
        // Get integer month, day, and year from user
        System.out.print("Please input the month, day, and year (seperated by spaces): ");
        month = scan.nextInt();
        day = scan.nextInt();
        year = scan.nextInt();
        
        // Check to see if month is valid
        if (month >= 1 && month <= 12) {
            monthValid = true;
        }

        // Check to see if year is valid
        if (year >= 1000 && year <= 1999) {
            yearValid = true;
        }
        
        // Determine whether it's a leap year
        if (year % 400 == 0)
            leapYear = true;
        else if ((year % 4 == 0) && (year % 100 != 0))
            leapYear = true;
        
        // Determine number of days in month
        if ((month == 2) && leapYear && day <= 29)
            daysInMonth = 29;
        
        else if ((month == 2) && !leapYear && day <= 28)
            daysInMonth = 28;
        
        else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
            daysInMonth = 31;
        
        else if (month == 4 || month == 6 || month == 9 || month == 11)
            daysInMonth = 30;
        
        else daysInMonth = 0;
        
        // User number of days in month to check to see if day is valid
        if (daysInMonth > 0)
            dayValid = true;
    
        // Determine whether date is valid and print appropriate message
        if (monthValid && dayValid && yearValid) {
            System.out.println("Date is valid.");
            if (leapYear)
                System.out.println("It a leap year.");
        } else
            System.out.println("Not a valid date.");
    }
}
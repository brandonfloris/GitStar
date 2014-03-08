import java.util.Scanner;

public class Temps {
    // --------------------------------------------------
    // Reads in a sequence of temperatures and finds the
    // maximum and minimum read in.
    // --------------------------------------------------
    public static void main(String[] args) {
        final int HOURS_PER_DAY = 5;
        final int MAX = -1000;
        int temp; // a temperature reading
        Scanner scan = new Scanner(System.in);
        // print program heading
        System.out.println();
        System.out.println("Temperature Readings for 24 Hour Period");
        System.out.println();
        
        int maxTemp = MAX;
        int timeOfMax = 0;
        
        int minTemp = Math.abs(MAX);
        int timeOfMin = 0;
        
        for (int hour = 0; hour < HOURS_PER_DAY; hour++) {
            System.out.print("Enter the temperature reading at " + hour
                    + " hours: ");
            temp = scan.nextInt();
            
        
            
            if (maxTemp < temp) {
                maxTemp = temp;
                timeOfMax = hour;
            }
            
            if (temp < minTemp) {
                minTemp = temp;
                timeOfMin = hour;
            }
        }
        // Print the results
        System.out.println("The max temp is: " + maxTemp
                + "\nHour: " + timeOfMax);
        
        System.out.println("The min temp is: " + minTemp
                + "\nHour: " + timeOfMin);
    }
}
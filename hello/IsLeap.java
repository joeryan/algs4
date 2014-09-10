/* IsLeap takes one argument and displays whether the year is or is not a leap year
 * Created by Joe Ryan, 9 September, 2014 for educational purposes
 * This work is released under the MIT License
 * 
 * IsLeap 2000
 * > The year 2000 is not a leap year
 * 
 * IsLeap 2004
 * > The year 2004 is a leap year
 * 
 * IsLeap 1999
 * > The year 1999 is not a leap year
*/
 

public class IsLeap {
    public static void main (String [] args) {
        int year = Integer.parseInt(args[0]);
        String leap = "is not";
        if ((year % 4) == 0) {
            if (!((year % 400) == 0)) { // check for millenea divided by 400
                leap = "is";
            }
        }
        
        System.out.println("The year " + year + " " + leap + " a leap year.");
    }
}

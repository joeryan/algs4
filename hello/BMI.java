/* BMI takes two command line arguments: 
 * weight in kilograms, height in meters and prints the BMI ratio
 * formula: BMI = weight / height^2
 * Created by Joe Ryan
 * released under MIT License
 */

public class BMI {
    public static void main (String [] args) {
        double weight = Double.parseDouble(args[0]);
        double height = Double.parseDouble(args[1]);
        double bmi = weight / (height * height);
        System.out.println("BMI is: " + bmi);
    }
}

                               
        
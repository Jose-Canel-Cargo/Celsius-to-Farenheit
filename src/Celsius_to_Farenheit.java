import java.util.Scanner;
public class Celsius_to_Farenheit {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Please input the temperature(in Celsius) that you wish to convert into Fahrenheit: ");
        double celsius = input.nextDouble();

        double fahrenheit = (9.0/5) * celsius + 32;

        System.out.println("\nThe temperature you submitted was: " + celsius + "(Celsius)");
        System.out.println("\nThe temperature in Fahrenheit is: " + fahrenheit);

        input.close();

        
    }
}

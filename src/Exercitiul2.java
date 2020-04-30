import java.util.Scanner;

public class Exercitiul2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Fahrenheit degree");
        int temperature = input.nextInt();

        input.close();

        int celsiusTemp = (int) (5.0 / 9.0 * (temperature - 32));
        System.out.println("After conversion the temperature is " + celsiusTemp + " degrees Celsius");

    }
}



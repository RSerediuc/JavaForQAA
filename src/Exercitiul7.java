import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercitiul7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your sales number please");
        int largest = input.nextInt();

        for (int counter = 0; counter <= 8; counter++) {
            System.out.println("Enter your number please.");
            int number = input.nextInt();

            if (largest < number) {
                largest = number;
            }
        }

        System.out.println("The largest number is " + largest);

        input.close();
    }
}

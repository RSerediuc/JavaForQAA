import java.util.Scanner;

public class Exercitiul5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the First Number");
        int number1 = input.nextInt();
        System.out.println("Enther the Second Number");
        int number2 = input.nextInt();
        System.out.println("Enter the Third Number");
        int number3 = input.nextInt();

        input.close();

        int sum = number1 + number2 + number3;
        int product = (number1 * number2) * number3;
        int average = product / 3;

        System.out.println("The sum of the three numbers is " + sum);
        System.out.println("The product of the three numbers is " + product);
        System.out.println("The average of the three numbers is " + average);

        if ((number1 > number2) && (number1 > number3)) {
            System.out.println("The largest number is " + number1);
        } else if ((number3 > number1) && (number3 > number2)) {
            System.out.println("The largest number is " + number3);
        } else {
            System.out.println("The largest number is " + number2);
        }

        if ((number1 < number2) && (number1 < number3)) {
            System.out.println("The smallest number is " + number1);
        } else if ((number2 < number1) && (number2 < number3)) {
            System.out.println("The smallest number is " + number2);
        } else {
            System.out.println("The smallest number is " + number3);
        }
    }
}

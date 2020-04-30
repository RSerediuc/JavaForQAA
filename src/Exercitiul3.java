import java.util.Scanner;

public class Exercitiul3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the First Number");
        int number1 = input.nextInt();
        System.out.println("Enther the Second Number");
        int number2 = input.nextInt();

        input.close();

        int sum = number1 + number2;
        int product = number1 * number2;
        int difference = number1 - number2;
        int quotient = number1 / number2;

        System.out.println("The sum of the two numbers is: " + sum);
        System.out.println("The product of the two numbers is " + product);
        System.out.println("The difference of the two numbers is " + difference);
        System.out.println("The quotient of the two numbers is " + quotient);
    }
}


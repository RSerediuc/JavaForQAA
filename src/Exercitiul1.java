import java.util.Scanner;

public class Exercitiul1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the First Number");
        int number1 = input.nextInt();
        System.out.println("Enter the Second Number");
        int number2 = input.nextInt();
        System.out.println("Enter the Third Number");
        int number3 = input.nextInt();
        input.close();

        int product = number1 * number2 * number3;
        System.out.println("The product of the three numbers is: " + product);
    }
}




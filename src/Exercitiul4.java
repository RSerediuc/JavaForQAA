import java.util.Scanner;

public class Exercitiul4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the First Number");
        int number1 = input.nextInt();
        System.out.println("Enther the Second Number");
        int number2 = input.nextInt();

        input.close();

        if (number1 > number2) {
            System.out.println(number1 + " is larger");
        } else if (number1 < number2) {
            System.out.println(number2 + " is larger");
        } else {
            System.out.println("These numbers are equals");
        }
    }
}

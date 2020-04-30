import java.util.Scanner;

public class Exercitiul6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the First Number");
        int num1 = input.nextInt();
        System.out.println("Enther the Second Number");
        int num2 = input.nextInt();

        input.close();

        if (num1 % num2 == 0) {
            System.out.println(num1 + " is a multiple of" + num2);
        } else {
            System.out.println(num1 + " is not a multiple of " + num2);
        }
    }
}

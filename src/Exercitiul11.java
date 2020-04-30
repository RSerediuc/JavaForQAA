import java.util.Scanner;

public class Exercitiul11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please write something");
        String userInput = input.nextLine();

        System.out.println(userInput.toUpperCase() + userInput.toLowerCase());

    }
}

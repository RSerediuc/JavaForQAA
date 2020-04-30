import java.util.Scanner;

public class Exercitiul9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the double radius of a sphere");
        double radius = input.nextDouble();

        double doubleVolume = (4.0 / 3.0) * Math.PI * Math.pow (radius, 3);
        System.out.println(doubleVolume);
    }
}

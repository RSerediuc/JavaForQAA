import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exercitiul12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please add maximum 20 grades");
        int noCounter = 0;
        int grade;
        List<Integer> gradesList = new ArrayList<>();


        do {
            grade = input.nextInt();
            noCounter++;
            gradesList.add(grade);
            if (grade == -1 || grade == 0) {
                noCounter--;
                gradesList.remove(gradesList.size()-1 );
            }

        }
        while (grade != 0 && noCounter < 20 );


        System.out.println(gradesList);

        }

    }

    public static void main

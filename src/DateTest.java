import java.util.Scanner;

public class DateTest {

    public static void main(String[] args) {
        Date date1 = new Date(13, -1, -100);

        Scanner input = new Scanner(System.in);
        int userMonth;
        int day;
        int year;

        System.out.println("\nPlease enter the month: ");
        userMonth = input.nextInt();
        date1.setMonth(userMonth);

        System.out.println("Please enter the day: ");
        day = input.nextInt();
        date1.setDay(day);

        System.out.println("Please enter the year");
        year = input.nextInt();
        date1.setYear(year);

        System.out.println("Date is");
        date1.displayDate();

    }
}

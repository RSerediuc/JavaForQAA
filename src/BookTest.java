import java.lang.reflect.Array;
import java.util.Arrays;

public class BookTest {
    public static void main(String[] args) {
        Book[] carte = new Book[3];
        carte[0] = new Book("Harry Potter and the Goblet of Fire", "12421", "J.K Rowling", "Corint");
        carte[1] = new Book("Game of Thrones: A song of Ice and Fire", "ABC-89XS", "R.R. Martin", "Polirom");
        carte[2] = new Book("Lord of the Rings: The Two Towers", "24s41", "J.R.R Tolkien", "Humanitas");

        //display book info
        for (int i = 0; i <= 2; i++) {
            System.out.println(carte[i].getBookInfo());
        }
    }
}

public class Book {
    private String bookName;
    private String isbnNumber;
    private String authorName;
    private String publisher;

    public Book(String newBookName, String newIsbnNo, String author, String newPublisher) {
        bookName = newBookName;
        isbnNumber = newIsbnNo;
        authorName = author;
        publisher = newPublisher;
    }

    //create get methods
    public String getBookName() {
        return bookName;
    }

    public String getIsbnNumber() {
        return isbnNumber;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getBookInfo() {
        return "Book name:\t" + bookName + "\tAuthor: " + authorName + "\tISBN: " + isbnNumber + "\tPublisher: " + publisher;
    }

    // create setter methods

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setIsbnNumber(String isbnNumber) {
        this.isbnNumber = isbnNumber;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}

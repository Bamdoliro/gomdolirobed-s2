
public class Book {
    private String bookname;
    private String author;
    private String isbn;
    private int total_books;
    private int availablebooks;

    public void setBook(String bookname, String author, String isbn, int total_Books,boolean loan) {
        this.bookname = bookname;
        this.author = author;
        this.isbn = isbn;
        this.total_books = total_Books;
        this.availablebooks = total_Books;
    }
    public String getBookname() {
        return bookname;
    }
    public String getAuthor() {
        return author;
    }
    public String getIsbn() {
        return isbn;
    }
    public int getTotal_books() {
        return total_books;
    }
    public int getAvailablebooks() {
        return availablebooks;
    }
    public void addBook(int count) {
        this.total_books += count;
        this.availablebooks += count;
    }
    public boolean borrowBook() {
        if(availablebooks > 0) {
           availablebooks--;
           return true;
        }
        return false;
    }
    public boolean returnBook() {
        if(availablebooks < total_books) {
            availablebooks++;
            return true;
        }
        return false;
    }
}
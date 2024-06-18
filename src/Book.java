
public class Book {
    private String bookname;
    private String author;
    private String isbn;
    private int total_books;
    private int availablebooks;

    //책의 속성을 입력하기 위한 코드
    public void setBook(String bookname, String author, String isbn, int total_Books,boolean loan) {
        this.bookname = bookname;
        this.author = author;
        this.isbn = isbn;
        this.total_books = total_Books;
        this.availablebooks = total_Books;
    }

    //책 이름 반환
    public String getBookname() {
        return bookname;
    }

    //책 저자 반환
    public String getAuthor() {
        return author;
    }

    //책 ISBN번호 반환
    public String getIsbn() {
        return isbn;
    }

    //책 전체 갯수 반환
    public int getTotal_books() {
        return total_books;
    }

    //대출 가능한 책 수 반환
    public int getAvailablebooks() {
        return availablebooks;
    }

    //책 갯수 추가
    public void addBook(int count) {
        this.total_books += count;
        this.availablebooks += count;
    }

    //책 대출, 대출이 된다면 대출 가능한 책 수가 1씩 빠진다.
    public boolean borrowBook() {
        if(availablebooks > 0) {
           availablebooks--;
           return true;
        }
        return false;
    }

    //책 반납, 반납이 되면 대출 가능한 책 수가 1씩 더해진다
    public boolean returnBook() {
        if(availablebooks < total_books) {
            availablebooks++;
            return true;
        }
        return false;
    }
}
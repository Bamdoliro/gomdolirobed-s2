
public class User {
    private String name;
    private Book borrow_book = null;
    private Book borrow_book2 = null;

    //도서관 이용자 이름을 받음
    public User(String name) {
        this.name = name;
    }

    //이용자 이름을 반환
    public String getName() {
        return name;
    }

    //대출 여부를 판단, 빌릴 수 있으면 borrow_book이나 borrow_book2에 저장
    //책을 2개 초과로 대출하려 할 시 메세지 출력, 다른 사람이 대출 중인 책을 대출하려해도 메세지 출력
    public boolean borrowBook(Book book) { // 책 대출
        if (borrow_book != null && borrow_book2 != null) {
            System.out.println("책은 최대 두 권까지만 대출할 수 있습니다.");
            return false;
        }
        if(book.borrowBook()) {
            if(borrow_book == null) borrow_book = book;
            else if(borrow_book2 == null) borrow_book2 = book;
            return true;
        }
        else {
            System.out.println("다른 사람이 대출 중인 책은 대출할 수 없습니다.");
            return false;
        }
    }

    //책 반납하는 코드
    //borrow_book,borrow_book2에 책이 있다면 null이 되고 Book 클래스에 책 반납 코드가 실행됨(반납했으므로 대출 가능한 책 수가 늘어남)
    //borrow_book,borrow_book2에 없는 책을 반납하려 하면 대출하지 않은 책은 반납할 수 없습니다.라는 메세지가 출력
    public boolean returnBook(Book book) {
        if (borrow_book == book) {
            borrow_book = null;
            book.returnBook();
            return true;
        }
        else if(borrow_book2 == book) {
            borrow_book2 = null;
            book.returnBook();
            return true;
        }
        else {
            System.out.println("대출하지 않은 책은 반납할 수 없습니다.");
            return false;
        }
    }

    //이용자가 대출한 책을 조회
    public void printBorrowBook() {
        if (borrow_book != null) {
            System.out.println(name + ":" + borrow_book.getBookname());
        }
        if (borrow_book2 != null) {
            System.out.println(name + ":" + borrow_book2.getBookname());
        }
    }
}
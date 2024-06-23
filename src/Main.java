import java.util.ArrayList;
import java.util.List;

// 도서 클래스
class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean checkedOut;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.checkedOut = false;
    }

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isCheckedOut() {
        return checkedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        this.checkedOut = checkedOut;
    }
}

// 도서관 클래스
class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
        initializeLibrary();
    }

    // 도서관 초기화 메서드
    private void initializeLibrary() {
        // 초기 도서 추가
        addBook(new Book("자바의 정석", "남궁성", "9788994492032"));
        addBook(new Book("객체지향의 사실과 오해", "조영호", "9788998139766"));
        addBook(new Book("모던 자바 인 액션", "라울 게이브리얼 우르마", "9791162242025"));
    }

    // 도서 추가 메서드
    public void addBook(Book book) {
        books.add(book);
    }

    // 도서 대출 메서드
    public boolean borrowBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn) && !book.isCheckedOut()) {
                book.setCheckedOut(true);
                return true;
            }
        }
        return false;
    }

    // 도서 반납 메서드
    public boolean returnBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn) && book.isCheckedOut()) {
                book.setCheckedOut(false);
                return true;
            }
        }
        return false;
    }

    // 전체 도서 목록 출력 메서드
    public void displayBooks() {
        System.out.println("도서 목록:");
        for (Book book : books) {
            System.out.println(book.getTitle() + " - 대출 여부: " + (book.isCheckedOut() ? "대출 중" : "보관 중"));
        }
    }
}

// 이용자 클래스
class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        // 도서관 생성
        Library library = new Library();

        // 이용자 생성
        User nightDoll = new User("이밤돌");
        User kimEero = new User("김이로");

        // TODO-3 도서 추가
        library.addBook(new Book("모던 자바 인 액션", "라울-게이브리얼-우르마", "9791162242025"));

        // TODO-4 도서 대출
        if (library.borrowBook("9788994492032")) {
            System.out.println(nightDoll.getName() + "이(가) 자바의 정석을 대출했습니다.");
        }

        if (library.borrowBook("9791162242025")) {
            System.out.println(nightDoll.getName() + "이(가) 모던 자바 인 액션을 대출했습니다.");
        }

        if (library.borrowBook("9791162242025")) {
            System.out.println(kimEero.getName() + "이(가) 모던 자바 인 액션을 대출했습니다.");
        } else {
            System.out.println("모든 사람은 모던 자바 인 액션을 이미 대출 중입니다.");
        }

        // TODO-6 도서 반납
        if (library.returnBook("9788994492032")) {
            System.out.println(nightDoll.getName() + "이(가) 자바의 정석을 반납했습니다.");
        }

        // TODO-7 도서 대출
        if (library.borrowBook("9788998139766")) {
            System.out.println(nightDoll.getName() + "이(가) 객체지향의 사실과 오해를 대출했습니다.");
        }

        // TODO-8 이미 대출된 도서 대출 시도
        if (library.borrowBook("9788998139766")) {
            System.out.println(kimEero.getName() + "이(가) 객체지향의 사실과 오해를 대출했습니다.");
        } else {
            System.out.println("이미 대출된 도서는 다른 사람이 대출 중이어서 대출할 수 없습니다.");
        }

        // TODO-12 전체 조회
        library.displayBooks();
    }
}

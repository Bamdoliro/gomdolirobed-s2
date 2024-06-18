public class Main {
    public static void main(String[] args) {

        // TODO-1 도서관 생성
        Library library = new Library(10);
        Book book1 = new Book("자바의 정석", "남궁성", "9788994492032");
        Book book2 = new Book("객체지향의 사실과 오해", "조영호", "9788998139766");
        Book book3 = new Book("모던 자바 인 액션", "라울 게이브리얼 우르마", "9791162242025");
        Book book5 = new Book("서정현의 인생", "이건우", "999123999");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book5);

        // TODO-2 이용자 생성
        User user1 = new User("이밤돌");
        User user2 = new User("김이로");

        // TODO-3 도서 추가
        Book book4 = new Book("모던 자바 인 액션", "라울 게이브리얼 우르마", "9791162242025");
        library.addBook(book4);

        // TODO-4 도서 대출
        library.borrowBook("9788994492032", user1); // 이밤돌이 자바의 정석 대출
        library.borrowBook("9791162242025", user1); // 이밤돌이 모던 자바 인 액션 대출
        library.borrowBook("9791162242025", user2); // 김이로가 모던 자바 인 액션 대출

        // TODO-5 이밤돌 도서 초과 대출 시도
        library.borrowBook("9788998139766", user1); // 이밤돌이 객체지향의 사실과 오해 대출 시도

        // TODO-6 이밤돌 도서 반납
        library.returnBook("9788994492032", user1); // 이밤돌이 자바의 정석 반납

        // TODO-7 이밤돌 도서 대출
        library.borrowBook("9788998139766", user1); // 이밤돌이 객체지향의 사실과 오해 대출

        // TODO-8 김이로 이미 대출된 도서 대출 시도
        library.borrowBook("9788998139766", user2); // 김이로가 객체지향의 사실과 오해 대출 시도

        // TODO-9 이밤돌 도서 반납
        library.returnBook("9788998139766", user1); // 이밤돌이 객체지향의 사실과 오해 반납

        // TODO-10 김이로 도서 대출
        library.borrowBook("9788998139766", user2); // 김이로가 객체지향의 사실과 오해 대출

        // TODO-11 김이로 대출하지 않은 책 반납 시도
        library.returnBook("9788994492032", user2); // 김이로가 자바의 정석 반납 시도

        // TODO-12 전체 조회
        library.printBooks(); // 도서 목록 조회
        user1.printBorrowedBooks(); // 이밤돌이 대출한 도서 조회
        user2.printBorrowedBooks(); // 김이로가 대출한 도서 조회
    }
}

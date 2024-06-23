package com.bamdoliro.gomdolirobed;

public class Main {
    public static void main(String[] args) {

        // TODO-1 도서관 생성
        Library library = new Library();
        library.addBook(new Book("자바의 정석", "남궁성", "9788994492032"));
        library.addBook(new Book("객체지향의 사실과 오해", "조영호", "9788998139766"));
        library.addBook(new Book("모던 자바 인 액션", "라울 게이브리얼 우르마", "9791162242025"));

        // TODO-2 이용자 생성
        User leeBamdol = new User("이밤돌");
        User kimIro = new User("김이로");

        // TODO-3 도서 추가
        library.addBook(new Book("모던 자바 인 액션", "라울 게이브리얼 우르마", "9791162242025"));

        // TODO-4 도서 대출
        leeBamdol.borrowBook(library, "9788994492032");
        leeBamdol.borrowBook(library, "9791162242025");
        kimIro.borrowBook(library, "9791162242025");

        // TODO-5 이밤돌 도서 초과 대출 시도
        if (!leeBamdol.borrowBook(library, "9788998139766")) {
            System.out.println("최대 2권의 책까지만 대출할 수 있습니다.");
        }

        // TODO-6 이밤돌 도서 반납
        leeBamdol.returnBook(library, "9788994492032");

        // TODO-7 이밤돌 도서 대출
        leeBamdol.borrowBook(library, "9788998139766");

        // TODO-8 김이로 이미 대출된 도서 대출 시도
        if (!kimIro.borrowBook(library, "9788998139766")) {
            System.out.println("다른 사람이 대출한 책은 대출할 수 없습니다.");
        }

        // TODO-9 이밤돌 도서 반납
        leeBamdol.returnBook(library, "9788998139766");

        // TODO-10 김이로 도서 대출
        kimIro.borrowBook(library, "9788998139766");

        // TODO-11 김이로 대출하지 않은 책 반납 시도
        if (!kimIro.returnBook(library, "9788994492032")) {
            System.out.println("대출하지 않은 책은 반납할 수 없습니다.");
        }

        // TODO-12 전체 조회
        System.out.println("도서 목록:");
        for (Book book : library.getAvailableBooks()) {
            System.out.println(book.getTitle() + " - " + book.getAuthor());
        }

        System.out.println("이밤돌이 대출한 도서 목록:");
        for (Book book : leeBamdol.getBorrowedBooks()) {
            System.out.println(book.getTitle() + " - " + book.getAuthor());
        }

        System.out.println("김이로가 대출한 도서 목록:");
        for (Book book : kimIro.getBorrowedBooks()) {
            System.out.println(book.getTitle() + " - " + book.getAuthor());
        }
    }
}

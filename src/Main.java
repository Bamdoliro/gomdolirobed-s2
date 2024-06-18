public class Main {
    public static void main(String[] args) {

        // TODO-1 도서관 생성
        // 부산소프트웨어마이스터고등학교 도서관(이하 도서관)을 생성합니다. 도서관에는 다음과 같은 책들이 있습니다.
        // 자바의 정석 저자 남궁성 ISBN 9788994492032
        // 객체지향의 사실과 오해 저자 조영호 ISBN 9788998139766
        // 모던 자바 인 액션 저자 라울 게이브리얼 우르마 ISBN 9791162242025
            Library library = new Library("부산소프트웨어마이스터고등학교 도서관");
            library.addBook1();
            library.addBook2();
            library.addBook3();
        // TODO-2 이용자 생성
        // 도서관 이용자 이밤돌을 생성합니다.
            User bamdol = new User("이밤돌");
        // 도서관 이용자 김이로를 생성합니다.
            User iro = new User("iro");
        //도서관에 이용자를 추가
            library.setUsers(bamdol, iro);
        // TODO-3 도서 추가
        // 도서관에 모던 자바 인 액션 저자 라울-게이브리얼-우르마 ISBN 9791162242025 이 한권 더 들어옵니다.
            Book modern = library.findBook("모던 자바 인 액션");
            modern.addBook(1);

        // TODO-4 도서 대출
        // 이밤돌이 도서관에서 자바의 정석을 대출합니다.
            bamdol.borrowBook(library.findBook("자바의 정석"));
        // 이밤돌이 도서관에서 모던 자바 인 액션을 대출합니다.
            bamdol.borrowBook(library.findBook("모던 자바 인 액션"));
        // 김이로가 도서관에서 모던 자바 인 액션을 대출합니다.
            iro.borrowBook(library.findBook("모던 자바 인 액션"));


        // TODO-5 이밤돌 도서 초과 대출 시도
        // 이밤돌이 도서관에서 객체지향의 사실과 오해를 대출합니다.
            bamdol.borrowBook(library.findBook("객체지향의 사실과 오해"));
        // 대출은 정상적으로 처리되지 않고, 최대 2권이 책까지만 대출할 수 있다는 메시지를 출력합니다.
            //유저 클래스에 있는 borrowBook에서 출력도 같이 됩니다.

        // TODO-6 이밤돌 도서 반납
        // 이밤돌이 도서관에 자바의 정석을 반납합니다.
            bamdol.returnBook(library.findBook("자바의 정석"));
        // TODO-7 이밤돌 도서 대출
        // 이밤돌이 도서관에서 객체지향의 사실과 오해를 대출합니다.
            bamdol.borrowBook(library.findBook("객체지향의 사실과 오해"));

        // TODO-8 김이로 이미 대출된 도서 대출 시도
        // 김이로가 도서관에서 객체지향의 사실과 오해를 대출합니다.
            iro.borrowBook(library.findBook("객체지향의 사실과 오해"));
        // 이밤돌이 이미 대출했으므로 대출은 정상적으로 처리되지 않고, 다른 사람이 대출한 책은 대출할 수 없다는 메시지를 출력합니다.
            //유저 클래스에 있는 borrowBook에서 출력도 같이 됩니다.

        // TODO-9 이밤돌 도서 반납
        // 이밤돌이 도서관에 객체지향의 사실과 오해를 반납합니다.
            bamdol.returnBook(library.findBook("객체지향의 사실과 오해"));

        // TODO-10 김이로 도서 대출
        // 김이로가 도서관에서 객체지향의 사실과 오해를 대출합니다.
            iro.borrowBook(library.findBook("객체지향의 사실과 오해"));

        // TODO-11 김이로 대출하지 않은 책 반납 시도
        // 김이로가 도서관에 자바의 정석 반납합니다.
            iro.returnBook(library.findBook("자바의 정석"));

        // 반납은 정상적으로 처리되지 않고, 대출하지 않은 책은 반납할 수 없다는 메시지를 출력합니다.
            //유저 클래스에 있는 returnBook에서 출력도 같이 됩니다.

        // TODO-12 전체 조회
        // 도서관에서 도서 목록을 조회합니다.
            //대출이 불가능한 책 조회
            library.printUnavailableBook();
            //대출이 가능한 책 조회
            library.printavailableBook();
        // 이밤돌이 본인이 대출한 도서를 조회합니다.
            bamdol.printBorrowBook();
        // 김이로가 본인이 대출한 도서를 조회합니다.
            iro.printBorrowBook();
    }
}
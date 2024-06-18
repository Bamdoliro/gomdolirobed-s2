public class Library {
    private String libraryName;
    private Book book1;
    private Book book2;
    private Book book3;

    private User bamdol;
    private User iro;

    public void setUsers(User bamdol, User iro) {
        this.bamdol = bamdol;
        this.iro = iro;
    }

    //도서관 제목을 받음
    public Library(String libraryName) {
        this.libraryName = libraryName;
    }

    //첫번째 책의 속성을 입력
    public void addBook1() {
        this.book1 = new Book();
        this.book1.setBook("자바의 정석","남궁성","9788994492032",1,true);
    }

    //두번째 책의 속성을 입력
    public void addBook2() {
        this.book2 = new Book();
        this.book2.setBook("객체지향의 사실과 오해", "조영호","9788998139766",1,true);
    }

    //세번째 책의 속성을 입력
    public void addBook3() {
        this.book3 = new Book();
        this.book3.setBook("모던 자바 인 액션", "라울 게이브리얼 우르마", "9791162242025",1,true);
    }

    //책 제목으로 해당하는 책 찾기
    public Book findBook(String bookname) {
        if(book1.getBookname() == bookname) { return book1;}
        if(book2.getBookname() == bookname) { return book2;}
        if(book3.getBookname() == bookname) { return book3;}
        return null;
    }

    public void printBorrower(String bookname) {
        if(bamdol.checkBorrow(bookname)) System.out.print(bamdol.getName() + ",");
        if(iro.checkBorrow(bookname)) System.out.print(iro.getName() + ",");
    }
    //도서관에 있는 책 모두 조회, availablebooks가 0보다 크다면 대출 가능한 책이 있으므로 대출 가능합니다를 출력
    //아니라면 대출이 불가능합니다. 라는 메세지를 출력
    public void printUnavailableBook() {
        System.out.print("대출 불가능한 책 : ");
        if(book1.getAvailablebooks()==0) {
            System.out.print(book1.getBookname() + ",");
            System.out.print(book1.getAuthor() + ",");
            System.out.print(book1.getIsbn() + ",");
            printBorrower("자바의 정석");
            System.out.println("대출이 불가능합니다.");
        }

        if(book2.getAvailablebooks()==0) {
            System.out.print(book2.getBookname() + ",");
            System.out.print(book2.getAuthor() + ",");
            System.out.print(book2.getIsbn() + ",");
            printBorrower("객체지향의 사실과 오해");
            System.out.println("대출이 불가능합니다.");
        }

        if(book3.getAvailablebooks()==0) {
            System.out.print(book3.getBookname() + ",");
            System.out.print(book3.getAuthor() + ",");
            System.out.print(book3.getIsbn() + ",");
            printBorrower("모던 자바 인 액션");
            System.out.println("대출이 불가능합니다.");
        }
    }
    public void printavailableBook() {
        System.out.print("대출 가능한 책 : ");
        if(book1.getAvailablebooks() > 0) {
            System.out.print(book1.getBookname() + ",");
            System.out.print(book1.getAuthor() + ",");
            System.out.print(book1.getIsbn() + ",");
            printBorrower("자바의 정석");
            System.out.println("대출이 가능합니다.");
        }

        if(book2.getAvailablebooks() > 0) {
            System.out.print(book2.getBookname() + ",");
            System.out.print(book2.getAuthor() + ",");
            System.out.print(book2.getIsbn() + ",");
            printBorrower("객체지향의 사실과 오해");
            System.out.println("대출이 가능합니다.");
        }

        if(book3.getAvailablebooks() > 0) {
            System.out.print(book3.getBookname() + ",");
            System.out.print(book3.getAuthor() + ",");
            System.out.print(book3.getIsbn() + ",");
            printBorrower("모던 자바 인 액션");
            System.out.println("대출이 가능합니다.");
        }
    }
}
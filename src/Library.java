class Library {
    private Book[] books;
    private int bookCount;

    public Library(int capacity) {
        this.books = new Book[capacity];
        this.bookCount = 0;
    }

    public void addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount++] = book;
        } else {
            System.out.println("도서관이 꽉 차서 책을 추가할 수 없습니다.");
        }
    }

    public void borrowBook(String isbn, User user) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getIsbn().equals(isbn) && books[i].isAvailable()) {
                if (user.borrowBook(books[i])) {
                    books[i].borrow(user.getName());
                    System.out.println(user.getName() + " 대출 " + books[i].getTitle());
                } else {
                    System.out.println(user.getName() + " 대출 한도입니다. ");
                }
                return;
            }
        }
        System.out.println("도서번호 " + isbn + " 대출불가.");
    }

    public void returnBook(String isbn, User user) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getIsbn().equals(isbn) && !books[i].isAvailable() && books[i].getBorrower().equals(user.getName())) {
                books[i].returnBook();
                user.returnBook(books[i]);
                System.out.println(user.getName() + " 반납함 " + books[i].getTitle());
                return;
            }
        }
        System.out.println(user.getName() + " 대출하지 않음 " + isbn);
    }

    public void printBooks() {
        System.out.println("대출가능 책:");
        for (int i = 0; i < bookCount; i++) {
            if (books[i].isAvailable()) {
                System.out.println(books[i].getTitle() + " by " + books[i].getAuthor() + " (ISBN: " + books[i].getIsbn() + ")");
            }
        }
        System.out.println("\n대출 불가 책:");
        for (int i = 0; i < bookCount; i++) {
            if (!books[i].isAvailable()) {
                System.out.println(books[i].getTitle() + " by " + books[i].getAuthor() + " (ISBN: " + books[i].getIsbn() + ") - 대출한사람: " + books[i].getBorrower());
            }
        }
    }
}


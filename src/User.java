class User {
    private String name;
    private Book[] borrowedBooks;
    private int borrowedCount;

    public User(String name) {
        this.name = name;
        this.borrowedBooks = new Book[2]; // 2권
        this.borrowedCount = 0;
    }

    public String getName() {
        return name;
    }

    public boolean borrowBook(Book book) {
        if (borrowedCount < 2) {
            borrowedBooks[borrowedCount++] = book;
            return true;
        }
        return false;
    }

    public void returnBook(Book book) {
        for (int i = 0; i < borrowedCount; i++) {
            if (borrowedBooks[i] == book) {
                borrowedBooks[i] = borrowedBooks[--borrowedCount];
                borrowedBooks[borrowedCount] = null;
                return;
            }
        }
    }

    public void printBorrowedBooks() {
        System.out.println(name + " 대출함:");
        for (int i = 0; i < borrowedCount; i++) {
            System.out.println(borrowedBooks[i].getTitle() + " by " + borrowedBooks[i].getAuthor());
        }
    }
}

class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable;
    private String borrower;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = true;
        this.borrower = null;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public String getBorrower() {
        return borrower;
    }

    public void borrow(String borrower) {
        this.isAvailable = false;
        this.borrower = borrower;
    }

    public void returnBook() {
        this.isAvailable = true;
        this.borrower = null;
    }
}


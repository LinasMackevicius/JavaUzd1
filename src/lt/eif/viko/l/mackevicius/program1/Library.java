package lt.eif.viko.l.mackevicius.program1;

interface Library {
    void borrowBook(Member member, Book book);

    void printBorrowedBooks();

    void addBook(Book book);

    void printAvailableBooks();
}
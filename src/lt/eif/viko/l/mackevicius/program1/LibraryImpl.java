package lt.eif.viko.l.mackevicius.program1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class LibraryImpl implements Library {
    private Map<Member, Book> borrowedBooks;
    private List<Book> availableBooks;

    public LibraryImpl() {
        this.borrowedBooks = new HashMap<>();
        this.availableBooks = new ArrayList<>();
    }


    @Override
    public void borrowBook(Member member, Book book) {
        if (availableBooks.contains(book)) {
            availableBooks.remove(book);
            borrowedBooks.put(member, book);
            System.out.println(member.getMemberName() + " borrowed " + book.getBookTitle());
        } else {
            System.out.println("lt.eif.viko.l.mackevicius.program1.Book is not available.");
        }
    }

    @Override
    public void printBorrowedBooks() {
        System.out.println("Borrowed Books:");
        for (Map.Entry<Member, Book> entry : borrowedBooks.entrySet()) {
            Member member = entry.getKey();
            Book book = entry.getValue();
            System.out.println(member.getMemberName() + " borrowed " + book.getBookTitle());
        }
    }

    @Override
    public void addBook(Book book) {
        availableBooks.add(book);
    }

    @Override
    public void printAvailableBooks() {
        System.out.println("Available Books:");
        for (Book book : availableBooks) {
            System.out.println("lt.eif.viko.l.mackevicius.program1.Book ID: " + book.getBookId() + ", Title: " + book.getBookTitle());
        }
    }
}
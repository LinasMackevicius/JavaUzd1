package lt.eif.viko.l.mackevicius.program1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pair<K, V> {
    private K first;
    private V second;

    public Pair(K first, V second) {

        this.first = first;

        this.second = second;
    }

    public K getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }

    public void setFirst(K first) {
        this.first = first;
    }

    public void setSecond(V second) {
        this.second = second;
    }

    public static void main(String[] args) {

        Book book1 = new Book(1, "Something in a way");

        Book book2 = new Book(2, "Smells like teen spirit");

        LibraryImpl library = new LibraryImpl();

        library.addBook(book1);

        library.addBook(book2);

        Member member1 = new Member(1, "Linas Mackevicius");

        Member member2 = new Member(2, "Jonas Jonaitis");

        library.borrowBook(member1, book1);
        library.borrowBook(member2, book2);

    }
}

interface Library {
    void borrowBook(Member member, Book book);

    void printBorrowedBooks();

    void addBook(Book book);

    void printAvailableBooks();
}

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
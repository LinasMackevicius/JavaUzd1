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

        MemberManager memberManager = new MemberManager();

        memberManager.addMembers(member1, member2);
        memberManager.printAllMembers();

        library.borrowBook(member1, book1);
        library.borrowBook(member2, book2);

        library.printAvailableBooks();

    }
}


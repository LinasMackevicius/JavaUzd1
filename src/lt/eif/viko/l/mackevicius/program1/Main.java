package lt.eif.viko.l.mackevicius.program1;
public class Main {
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





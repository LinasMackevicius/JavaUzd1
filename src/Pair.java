public class Pair<K, V> {
    private K bookId;
    private V bookName;

    public Pair(K bookId, V bookName) {
        this.bookId = bookId;
        this.bookName = bookName;
    }

    public K getBookId() {
        return bookId;
    }

    public V getBookName() {
        return bookName;
    }

    public void setBookId(K bookId) {
        this.bookId = bookId;
    }

    public void setBookName(V bookName) {
        this.bookName = bookName;
    }

    public static void main(String[] args) {
        Pair<Integer, String> bookPair = new Pair<>(123, "Java Programming");

        System.out.println("Book ID: " + bookPair.getBookId());
        System.out.println("Book Title: " + bookPair.getBookName());
    }
}

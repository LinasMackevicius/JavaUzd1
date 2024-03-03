package lt.eif.viko.l.mackevicius.program1;

class Book {
    private Pair<Integer, String> bookInfo;

    public Book(int bookId, String bookTitle) {
        this.bookInfo = new Pair<>(bookId, bookTitle);
    }

    public int getBookId() {
        return bookInfo.getFirst();
    }

    public String getBookTitle() {
        return bookInfo.getSecond();
    }
}
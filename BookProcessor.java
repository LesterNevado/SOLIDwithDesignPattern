public class BookProcessor {
    private StudentBook studentBook;
    private Borrowable borrowable;

    public BookProcessor(StudentBook studentBook, Borrowable borrowable) {
        this.studentBook = studentBook;
        this.borrowable = borrowable;
    }

    public void process () {
        borrowable.borrow(studentBook.getTitle());
    }

}

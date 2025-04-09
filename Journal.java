public class Journal implements Borrowable{

    @Override
    public void borrow(String title) {
        // logic for borrowing journal
        System.out.println("Borrowing Journal: " + title);
    }

}

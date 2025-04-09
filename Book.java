public class Book implements Borrowable{

    @Override
    public void borrow(String title) {
        // logic for borrowing book
        System.out.println("Borrowing Book: " + title);
    }
    
}

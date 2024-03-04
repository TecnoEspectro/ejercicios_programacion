
package books;


public class Book {
    String title;
    int quantity;
    String id;
    String genre;
    String loanDate;
    String returnDate;
    boolean available;

    public Book(String title, int quantity, String id, String genre) {
        this.title = title;
        this.quantity = quantity;
        this.id = id;
        this.genre = genre;
        this.available = true;
    }
    
    public void lendBook() {
        this.available = false;
}
    public void returnBook() {
        this.available = true;
    }

    public boolean isAvailable() {
        return available;
    }
    
}

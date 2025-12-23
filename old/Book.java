

public class Book {
    protected String book_title;

    public Book(String title){
        this.book_title=title;
    }

    public void display(){
        System.out.println("Book Title : "+ book_title);
    }
}

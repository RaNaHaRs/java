

public class Main {
    public static void main(String[] args) {
        Book book;
        System.out.println("Noval Information:");
        book = new noval("To Kill a Mockingbird", "Harsh");
        book.display();

        System.out.println();
        System.out.println();

        System.out.println("Comic Information:");
        book = new comic("Marvel", "Ayush");
        book.display();
    }
}

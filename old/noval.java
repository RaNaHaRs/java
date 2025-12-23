

public class noval extends Book {
    private String author_name;

    public noval(String title , String author){
        super(title);
        this.author_name=author;
    }

    @Override
    public void display(){
        System.out.println("Noval Title :" + book_title);
        System.out.println("Name of Author :" + author_name);
    }

}

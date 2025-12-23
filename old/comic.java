

public class comic extends Book{
    private String author_name;

    public comic(String title , String author){
        super(title);
        this.author_name=author;
    }

    @Override
    public void display(){
        System.out.println("Comic Title :" + book_title);
        System.out.println("Name of Author :" + author_name);
    }

}


class Book{
    void category(){
        System.out.println("These are categorized books");
    }
}

class GrammerBooks extends Book{

    @Override
    void category() {
            System.out.println("This is grammer book");
        };
    }


public class MethodOverriding {
    public static void main(String[] args) {


        Book b1 = new Book();
        b1.category();

        GrammerBooks g1 = new GrammerBooks();
        g1.category();

        Book bg1 = new GrammerBooks();
        bg1.category();

    }}
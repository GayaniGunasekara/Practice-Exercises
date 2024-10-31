interface Printable{
    void print();
}

class Document implements Printable{

    public void print(){
        System.out.println("Printing document");
    };
}

class Image implements Printable{
    public void print(){
        System.out.println("Printing Image");
    }
}
public class InterfacesEX {
    public static void main(String[] args) {

        Printable doc = new Document();
        Printable img = new Image();
        doc.print();
        img.print();
    }





}

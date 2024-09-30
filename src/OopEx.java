public class OopEx {


    String name;
    String color;
    int ram;


    public void call(){
        System.out.println("take a call from " + name);
    }

    public void browseInternet(){
        System.out.println("browse internet");
    }

    public static void main(String[] args) {
        OopEx phone01 = new OopEx();
        phone01.name = "iphoneX";
        phone01.color = "black";
        phone01.call();
    }
}

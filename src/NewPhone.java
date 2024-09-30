public class NewPhone extends OldPhone{

    void browseInternet(){

        System.out.println("happy browsing");

    }

    public static void main(){

        NewPhone obj2 = new NewPhone();
        obj2.call();
        obj2.message();

    }

}






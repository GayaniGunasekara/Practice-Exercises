import java.sql.SQLOutput;

public class ThisKeyword {



    String name ;
    int age;





    ThisKeyword (String name,int age){

       this.name= name;
       this.age = age;

    }




    public static void main(String[] args) {

        ThisKeyword obj = new ThisKeyword("Gayani", 23);

        System.out.println( obj. name );
        System.out.println( obj.age );

    }










}

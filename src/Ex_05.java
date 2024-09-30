import java.sql.SQLOutput;

public class Ex_05{
    public static void main(String[]args) {

        String s1 = "Pamod Piushan";
        String s2 = "Pamod Piushan";

        if (s1==s2){
            System.out.println("yes");
        }
        else {
            System.out.println("No");
        }

        String s3 = new String("gayani");
        String s4 = new String("gayani");

        if (s3==s4){
            System.out.println("yes");
        }
        else {
            System.out.println("No");
        }


        char[] x = {'p' , 'a' , 'm' , 'o' , 'd'};
        String s5 = new String(x);
        System.out.println(s5);


        String txt = "Gayani";
        System.out.println(txt.replace("Ga","Ja"));





    }}

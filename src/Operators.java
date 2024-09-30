import java.sql.SQLOutput;

public class Operators {
    public static void main(String[]args){
        long x = 10;
        int y = 4;
        int z = 3;


        double answer1 = x+y+z;
        double answer2 = x - y + z;
        double answer3 = x * y +2 ;
        double answer4 = x/y;
        double answer5 = x/z;
        double answer6 = x++;
        double answer7 = ++x;
        int answer8 = ++y;
        double answer9 = --x;



        System.out.println(answer1);
        System.out.println(answer2);
        System.out.println(answer3);
        System.out.println(answer4);
        System.out.println(answer5);
        System.out.println(answer6);
        System.out.println(answer7);
        System.out.println(answer8);
        System.out.println(answer9);




        String weekday = "sunday";
        switch (weekday){
            case "monday":
                System.out.println("Monday");
                break;
            case "tuesday":
                System.out.println("Tuesday");
                break;
            case "wednesday":
                System.out.println("Wednesdsay");
                break;
            case "thursday":
                System.out.println("Thursday");
                break;
            case "friday":
                System.out.println("Friday");
                break;
            default:
                System.out.println("Holiday");
        }
    }
}

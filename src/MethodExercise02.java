import java.util.Scanner;

public class MethodExercise02 {



    public static  void GradeCalculator(){

        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter your marks: ");
        double marks = myobj.nextDouble();

        if (marks>5.00){
            System.out.println("Exellent");
        }

        else if (marks>4.50){
            System.out.println("Very Good");
        }

        else if (marks>3.50){
            System.out.println("Good");
        }

        else if (marks>3.00){
            System.out.println("Poor");
        }

        else if (marks>2.00){
            System.out.println("Fail");
        }

        else {
            System.out.println("Invalid marks");
        }

    }


    public static void main(String[] args) {

        GradeCalculator();
    }
}

import java.util.Scanner;

public class ExamPractiice01 {

    public static void main(String[] args) {

        Scanner input1 = new Scanner(System.in);

        System.out.println("Enter First Number: ");
        int num1 = input1.nextInt();

        System.out.println("Enter Second Number: ");
        int num2 = input1.nextInt();

        if (num1>num2){
            System.out.println(num1 + "Is Larger");
        }else if(num1<num2) {
            System.out.println(num2 + "Is Larger");
        }else {
            System.out.println("Numbers are equal");
        }



        Scanner input2 = new Scanner(System.in);

        System.out.println("Enter the third number:");
        int num3 = input2.nextInt();

        System.out.println("Enter the fourth number:");
        int num4 = input2.nextInt();

        double mul = num3*num4;
        System.out.println(mul + "is the multiplied answer");


    }
}

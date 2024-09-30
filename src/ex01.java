import java.util.Scanner;
public class ex01 {
    public static void main(String[] args) {

        Scanner maximum = new Scanner(System.in);
        System.out.println("Enter first number:");
        int firstNum = maximum.nextInt();

        System.out.println("Enter second number:");
        int secondNum = maximum.nextInt();



        int max = Math.max(firstNum,secondNum);
        System.out.println("The maximum number is "+ max);

        int sum = firstNum + secondNum;
        System.out.println("The sum of two numbers "+ sum);

        float div = firstNum / secondNum;
        System.out.println("The division of two numbers: " + div);

        if(firstNum==secondNum){
                System.out.println("Two numbers are same");}
        else{System.out.println("two numbers are not same");
    }

        System.out.println("Enter Third Number:");
        int thirdNum = maximum.nextInt();

        if(thirdNum%2==0){
            System.out.println("Odd number");
        }
        else {
            System.out.println("Even number");
        }


        int count = 1;
        while (count <= 5) {
            System.out.println("Count is: " + count);
            count++;
        }


}}
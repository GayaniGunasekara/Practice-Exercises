import java.util.Scanner;


public class FindOddEven {
    public static void main(String[]args){

        Scanner numberInput = new Scanner(System.in);
        System.out.println("Enter a number");

        int x = numberInput.nextInt();



        if (x%2==1){
            System.out.println("This is a Odd nuumber");
        }
        else {
            System.out.println("This is an Even Number");
        }
    }
}

import java.util.Scanner;


public class MAximumOfThreeNumbers {
    public static void main(String[]args){

        Scanner num = new Scanner(System.in);
        System.out.println("Enter First Number");
        int x = num.nextInt();
        System.out.println("Enter second Number");
        int y = num.nextInt();
        System.out.println("Enter third Number");
        int z = num.nextInt();

        if(x>y){
            if(x>z){
                System.out.println("The maximum is:  "+x);
            }
            else {
                System.out.println("The maximum is:  "+z);
            }}
        else{
            if (y>z){
                System.out.println("The maximum is:  "+y);
            }
            else{
                System.out.println("The maximum is:  "+z);
            }
        }




    }
}

import java.util.Scanner;

public class FactorialOfNumber {

    public static void main(String[]args){

        Scanner num = new Scanner(System.in);
        System.out.println("Enter a number:");
        int x = num.nextInt();

        int fac= 1;
        for(int i =1; i<=x ; i++){
            System.out.println(i);
            fac *=i;
         }

        System.out.println(fac);
    }

}

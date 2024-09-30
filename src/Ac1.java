import java.util.Scanner;

public class Ac1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter first number");
        int x = scanner.nextInt();

        System.out.println("Enter second number");
        int y = scanner.nextInt();

        System.out.println("The addition is: ");
        int add = x+y;
        System.out.println(add);

        System.out.println("The substraction is");
        int sub = x - y;
        System.out.println(sub);


        System.out.println("The multiplication is");
        int mul = x * y;
        System.out.println(mul);


        System.out.println("The division is");
        int div = x / y;
        System.out.println(div);





        System.out.println("Enter a number ");
        int z = scanner.nextInt();

        if(z%2==0){
            System.out.println("It is an even number");
        }
        else {
            System.out.println("It is an odd number");
        }


        System.out.println("Enter a number");


    }
}

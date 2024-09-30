import java.util.Scanner;

public class AreaOfShapes {

    public static void main (String[]args){
        Scanner num = new Scanner(System.in);

        //Area of the triangle
        System.out.println("Enter the height of trianle: ");
        double heightOfTriangle = num.nextDouble();

        System.out.println("Enter the width of the triangle:");
        double widthOfTriangle =  num.nextDouble();

        Double AreaOfTrianle = (heightOfTriangle*widthOfTriangle)/2;
        System.out.println("The Area Of The Triangle:"+ AreaOfTrianle);


        //area of the rectangle
        System.out.println("Enter the height of the rectangle:");
        double heightOfRectangle = num.nextDouble();

        System.out.println("Enter the width of the rectangle:");
        double widthOfRectangle = num.nextDouble();

        Double AreaOfRectangle = (heightOfRectangle*widthOfRectangle);
        System.out.println("The Area Of The Triangle:"+ AreaOfRectangle);
    }
}

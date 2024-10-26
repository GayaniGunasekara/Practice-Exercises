public class DataTypes {
    public static void main(String[] args) {
        /// overflow
        int b1 = 130;
        byte x = (byte)b1;
        System.out.println(b1);
        System.out.println(x);

        // widening casting
        int num1 = 30;
        double num2 = num1;
        System.out.println(num1);
        System.out.println(num2);

//narrowing casting
        double num3 = 56.23;
        int num4  = (int)num3;
        System.out.println(num3);
        System.out.println(num4);


    }
}

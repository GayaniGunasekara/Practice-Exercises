public class ExceptionHandling {
    public static void main(String[] args) {




        //multi catch statement
        try{
            int[] numbers ={2,4,5};
            System.out.println(numbers[5]);;

        }catch (ArrayIndexOutOfBoundsException | ArithmeticException r){
            System.out.println("error occurs");
        }


//separate catch statement
        try{
            int[]a = new int[20];
            a[40]=434;
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException");
        }catch(NullPointerException b){
            System.out.println("NullPointerException ");
        }catch ( ArrayIndexOutOfBoundsException c){
            System.out.println("ArrayIndexOutOfBoundsException");
        }catch (Exception r){
            System.out.println("General Exception occurs");
        }

        String s=null;
        try {

            System.out.println("Length of the string="+s.length());
        }catch (NullPointerException n){
            System.out.println("The string is null");
        }



    }



}

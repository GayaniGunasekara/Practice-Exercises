public class ex02 {

    double num1;
    double num2;


    public ex02(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
    }




    public double add(){
        return num1+num2;
    }

    public double div(){
        return num1/num2;
    }





public static void main (String[]args){

        ex02 obj01 = new ex02(40,30);

        double addition1 = obj01.add();
        double divition1 = obj01.div();

        System.out.println("The addition of two numbers in first object:" + addition1);
        System.out.println("The divition of two numbers in first object:" + divition1);





        ex02 obj02 = new ex02(100,20);

        double addition2 = obj02.add();
        double divition2 = obj02.div();

        System.out.println("The addition of two numbers in second object:" + addition2);
        System.out.println("The divition of two numbers in second object:" + divition2);

}}



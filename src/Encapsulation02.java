public class  Encapsulation02 {

    private String stdID ;
    private int age;
    private double height;

    public void setStdID(String stdID){
        this.stdID=stdID;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setHeight(double height){
        this.height = height;
    }

    public String getStdID(){
        return stdID;
    }
    public int getAge(){
        return age;
    }
    public double getHeight(){
        return height;
    }
}

class TestEncapsulation02 {
    public static void main(String[] args) {


        Encapsulation02 ex1 = new Encapsulation02();

        ex1.setStdID("10034");
        ex1.setAge(25);
        ex1.setHeight(100.64);

        System.out.println(ex1.getStdID());
        System.out.println(ex1.getAge());
        System.out.println(ex1.getHeight());
    }
}
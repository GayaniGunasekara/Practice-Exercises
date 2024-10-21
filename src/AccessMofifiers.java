public class AccessMofifiers {

    private String model;
    private int year;



    public AccessMofifiers(String model, int year){
        this.model = model;
        this.year =  year;
    }
    public String getModel() {
        return model;
    }

    public int getYear(){
        return year;
    }

    public String toString() {
        return "Model: " + model + ", Year: " + year;
    }

    public static void main(String []args){

        AccessMofifiers computer = new AccessMofifiers("BMW" , 2003);




        System.out.println(computer.model);
        System.out.println(computer.year);
        System.out.println(computer);



    }
}

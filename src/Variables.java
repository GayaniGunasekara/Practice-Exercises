public class Variables {

     void method(){
        int x=10;
        System.out.println(x);

    }

    int y = 20;
     int z =25;
    static int p = 30;
    static String name;


    static void sleep(){
        System.out.println("Sleeeping");
    }




    //Non-static method can call static and non-static content
    static int vehicleNo;
    String VehicleName;

    void method111(){
        vehicleNo = 1213;
        VehicleName =  "Toyota";
    }

    //Static method can call only static context, Non-static content can call by creating objects
    int StId;
    void add(){
        System.out.println("Numbers are added");
    }
    static void calculate(){
        Variables c1 = new Variables();
        c1.StId = 3244;
        c1.add();
    }




    public static void main(String[] args) {

sleep();
        Variables v1 = new Variables();
        v1.method();
        System.out.println(v1.y);
        System.out.println(v1.z);

        System.out.println(p);
        System.out.println(name);


        Variables v2 = new Variables();
        v2.name ="gayani";
        System.out.println(v2.name);

        Variables v3 = new Variables();
        v3.name = "Pamod";
        System.out.println(v3.name);



    }

}


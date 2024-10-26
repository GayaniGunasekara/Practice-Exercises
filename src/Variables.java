public class Variables {

     void method(){
        int x=10;
        System.out.println(x);

    }

    int y = 20;
     int z =25;
    static int p = 30;
    public static void main(String[] args) {


        Variables v1 = new Variables();
        v1.method();
        System.out.println(v1.y);
        System.out.println(v1.z);
        System.out.println(p);
        System.out.println(v1.p);
    }

}

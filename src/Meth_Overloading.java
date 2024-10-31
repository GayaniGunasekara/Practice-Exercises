public class Meth_Overloading {

    public void meth(){
        System.out.println("Method1");
    }
    public void meth(int x){
        System.out.println("Method2");
    }
    public void meth(double y){
        System.out.println("Method3");
    }
    public void meth(int x, double y){
        System.out.println("Method4");
    }

    public static void main(String[] args) {
        Meth_Overloading obj = new Meth_Overloading();
        obj.meth();
        obj.meth(4);
        obj.meth(3.4);
        obj.meth(4,6.4);}}

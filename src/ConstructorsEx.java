public class ConstructorsEx {
    String regNo;
    String name;
    int age;



    ConstructorsEx(String a, String b , int c){

        regNo = a;
        name = b;
        age = c;
        System.out.println(regNo+ "  "+name+ "  "+age);
    }


    ConstructorsEx(String d, String e){
        regNo = d;
        name = e;
        System.out.println(regNo+ "  " +name);
    }

    public static void main(String[] args) {

        ConstructorsEx E1 = new ConstructorsEx("1001","gayani",22);
        ConstructorsEx E2 = new ConstructorsEx("1002","Pamod");

    }
}

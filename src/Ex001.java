public class Ex001 {
    public String name;
    public  int age;


    public void  introduce(String name, int age){
        this.name=name;
        this.age=age;
        System.out.println("Name is :"+ name +" "+ "Age is:" +age);
    }

    public static void main(String[] args) {
        Ex001 person1 = new Ex001();

        person1.introduce("Gayani" , 23);

    }


}

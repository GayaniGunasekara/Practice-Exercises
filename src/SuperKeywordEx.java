import java.awt.*;

class Person {


    Person(String city){
        System.out.println("city is " +city);
    }
    String name = "person001";
    void sound(){
        System.out.println("person speeks");
    }
}


class Student extends Person{


    Student() {
        super("Colombo");
    }


    String name = "student001";

    void Askname(){
        System.out.println(name);
        System.out.println(super.name);
    }
    void sound(){
        System.out.println("Student talks");
        super.sound();
    }

}
 class SuperKeywordEx {
     public static void main(String[] args) {
          Student s1 = new Student();
          s1.Askname();

          Student s2 = new Student();
          s2.sound();
     }
     }
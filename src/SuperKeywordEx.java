class Person {
    String name = "person001";
}
class Student extends Person{
    String name = "student001";

    void Askname(){
        System.out.println(name);
        System.out.println(super.name);
    }
}

 class SuperKeywordEx {

     public static void main(String[] args) {
          Student s1 = new Student();
          s1.Askname();
          Person p1 = new Person();
         System.out.println(p1.name);

     }
     }
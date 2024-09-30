public class ex03_person {

    String name;

    int age;

    double salary;

    public ex03_person(String name, int age, double salary){
        this.name = name;
        this.age =age;
        this.salary = salary;
    }


    public void displayInfo() {
        System.out.println("person name " + name);
        System.out.println("Person age" + age);
        System.out.println("person's Salary " + salary);
    }

    public static void main(String[]args){

        ex03_person person01 = new ex03_person("Saman",25,250000);
        person01.displayInfo();

    }



}

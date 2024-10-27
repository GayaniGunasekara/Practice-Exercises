class Animal{
    void eat(){
        System.out.println("Eating food");
    }
    int age;
}

class Dog extends Animal{
    void bark(){
        System.out.println("barking a dog");
    }
    String bread;


public static class InheritanceEx {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.bark();
        d1.eat();
        d1.bread="Golden";
        d1.age =12;
        System.out.println(d1.bread);
        System.out.println(d1.age);
    }}}

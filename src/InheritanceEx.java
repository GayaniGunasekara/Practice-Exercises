class Animal{
    void eat(){
        System.out.println("Eating food");

    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("barking a dog");
    }


public static class InheritanceEx {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.bark();
        d1.eat();
    }}}

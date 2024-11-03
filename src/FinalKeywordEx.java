
final class Animal1 { // This class cannot be inherited
    final String species = "Dog";

    final void makeSound() { // This method cannot be overridden
        System.out.println("Bark");

    }
}

public class FinalKeywordEx {
    public static void main(String[] args) {

        Animal1 animal = new Animal1();
        System.out.println("Species: " + animal.species);
        animal.makeSound();
    }
}

package myanimals;

public class Animal {

    public static int numOfAnimals = 0;

    public Animal() {
        numOfAnimals++;
        System.out.println("Number of animals so far: " + numOfAnimals);
    }
    public static void main(String[] args) {
        System.out.println("Starting number of animals: " + numOfAnimals);

        Cat myCat = new Cat();
        myCat.meow();
        myCat.name = "Stella";
        myCat.age = 8;
        System.out.println("Cat max lives: " + Cat.MAX_LIVES);
        System.out.println("Total cats created: " + Cat.getCatCount());

        Dog myDog = new Dog();
        myDog.bark();
        myDog.name = "Loki";
        myDog.age = 3;

        System.out.println("Total animals (cats + dogs): " + numOfAnimals);
    }
}

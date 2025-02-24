package myanimals;

public class Cat extends Animal {
    public static final int MAX_LIVES = 9;
    private static int catCount = 0;

    String name;
    int age;
    int LivesRemaining;

    public Cat () {
        super();
        catCount++;
        LivesRemaining = MAX_LIVES;
    }

    public void meow(){
        System.out.println("Meow");
    }

    public static int getCatCount(){
        return catCount; 
    }
}

package myanimals;

public class Dog extends Animal {
    private static int dogCount = 0;

     String name;
     int age;

    public Dog() {
        super(); 
        dogCount++; 
    }
    
    public void bark() {
        System.out.println("Woof");
    }
    
    public static int getDogCount() {
        return dogCount;
    }
}

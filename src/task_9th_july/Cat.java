package task_9th_july;

public class Cat extends Animal {
    public void meow() {
        System.out.println("cat sounds meow");
    }

    public static void main(String[] args) {


        Cat a = new Cat();
        a.makeSound();
        a.meow();

    }
}
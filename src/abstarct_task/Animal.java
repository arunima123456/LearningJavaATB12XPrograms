package abstarct_task;

abstract class Animal
{
abstract void makeSound();
static class Dog extends Animal
{
    @Override
    void makeSound()
    {
        System.out.println("dog barks");
    }
}
static  class Cat extends Animal{
    @Override
    void makeSound()
    {
        System.out.println("cat meows");
    }
}

    public static void main(String[] args) {
        Dog d=new Dog();
        d.makeSound();
        Cat c=new Cat();
        c.makeSound();

    }
}

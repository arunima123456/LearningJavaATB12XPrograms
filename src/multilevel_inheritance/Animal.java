package multilevel_inheritance;

class Animal {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal {
    public void animalSound() {
        super.animalSound(); // Call the parent method
        System.out.println("The dog says: bow wow");
    }
}

class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.animalSound();

        Animal a=new Animal();
        a.animalSound();
    }
}
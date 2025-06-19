package multilevel_inheritance;

public class vehicle {
    void start(){
        System.out.println("Vehicle is starting");
    }
}

//Derived class car
class Car extends vehicle{
    void drive(){
        System.out.println("Car is driving");
    }
}

//second derived class bike
class Bike extends vehicle{
    void ride(){
        System.out.println("Bike is riding");
    }
}
package multilevel_inheritance;

public class main
{
    public static void main(String[] args) {
        //Create car object
        Car myCar = new Car();
        myCar.start();  // Inherited from Vehicle
        myCar.drive(); // Car's own method

        //Create bike object
        Bike myBike = new Bike();
        myBike.start(); //Inherited from Vehicle
        myBike.ride(); //Bike's own method
    }
}

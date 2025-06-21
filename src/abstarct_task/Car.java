package abstarct_task;

import org.w3c.dom.ls.LSOutput;

public class Car implements vehicle ,speedLimit
{
    public static void main(String[] args) {
Car c=new Car();
c.start();
        System.out.println(vehicle.fuelType());
        System.out.println(speedLimit.MAX_SPEED);

    }


}




interface speedLimit
{
     int MAX_SPEED = 120;

}



interface vehicle
{
default void start()
{
    System.out.println("vehicle started");
}
static boolean fuelType()
{
    System.out.println("fuel type is petrol");
    return true;
}
}

package task_10th_july;

public class Vehicle
{
    public void start()
    {
        System.out.println("vehicle started");
    }
    public static class Bike extends Vehicle
    {
        public void start()
        {
            System.out.println("Kick start the bike");
        }
        public static class Car extends Vehicle
        {
            public void start()
            {
                System.out.println("turn the key to start the car ");
            }

            public static void main(String[] args) {
                Vehicle vehicle=new Vehicle();
                vehicle.start();
                Bike b= new Bike();
                b.start();
                Car c=new Car();
                c.start();
            }
        }
    }
}

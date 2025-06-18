package Oops_constructor;

public class car {
    String model;
    String brand;
    int price;

    public car(String model, String brand, int price) {
        this.brand = brand;
        this.price = price;
        this.model = model;
    }

    public void details() {
        System.out.println("brand:" + brand);
        System.out.println("model:" + model);
        System.out.println("price:" + price);
    }

    public static void main(String args[]) {
        car c = new car("UXXX", "nano", 120000);
        c.details();
    }
}

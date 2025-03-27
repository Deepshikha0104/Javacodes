package oops.Constructorss;

public class Car {
    String model;
    int price;
    {
        System.out.println("instance of the code");
    }
    public Car(String model, int price) {
        System.out.println("Constructore is executing");
        this.model = model;
        this.price = price;
    }
}

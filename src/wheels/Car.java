package wheels;

public class Car extends Vehicle {

    private String driver;

    public Car(int pax) {
        super(pax);
    }

    @Override
    public void move() {
        System.out.println("the car is moving");
    }

    @Override
    void makeSound() {
        System.out.println("beep beep");
    }
}

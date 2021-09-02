package wheels;

public class Boat extends Vehicle {

    private String captain;

    public Boat(int pax) {
        super(pax);
    }

    @Override
    public void move() {
        System.out.println("the boat is sailing");
    }

    @Override
    void makeSound() {
        System.out.println("honk");
    }
}

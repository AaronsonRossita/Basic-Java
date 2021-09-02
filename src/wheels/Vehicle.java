package wheels;

abstract class Vehicle {

    private int pax;
    public int a;
    public static int whatever;

    public Vehicle(int pax) {
        this.pax = pax;
    }

    abstract void move();
    abstract void makeSound();

    public static void print(){
        System.out.println("I'm abstract");
    }

}

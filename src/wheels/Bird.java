package wheels;

interface Animal{

    void eat();
}

public class Bird implements Flyable, Animal {

    @Override
    public void fly() {
        System.out.println("a bird can fly");
    }

    @Override
    public void eat() {

    }
}

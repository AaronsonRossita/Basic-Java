package wheels;

interface Flyable{

    int a = 5;

    void fly();

    default void what(){
        System.out.println("this is the default behaviour");
    }
}

public class Plane implements Flyable  {

    private String pilot;


    @Override
    public void fly() {
        System.out.println("the plane can fly");
    }
}

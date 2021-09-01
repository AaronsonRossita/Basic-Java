package technology;

public class HousePhone extends Phone {

    public HousePhone(int number, String model) {
        super(number, model);
    }

    @Override
    public void text() {
        System.out.println("can't send text");
    }
}

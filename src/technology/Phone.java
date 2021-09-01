package technology;

public class Phone {

    private int number;
    protected String model;

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public void call(){};

    public void text(){
        System.out.println("I've send a text");
    };

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

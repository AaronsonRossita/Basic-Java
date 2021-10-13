package prototype;

public class Sheep implements Animal {

    public String name;

    public Sheep(String name) {
        System.out.println("Sheep is made");
        this.name = name;
    }

    @Override
    public Animal cloneAnimal() {
        System.out.println("Sheep is being made");
        Sheep clonedSheep = null;
        try {
            clonedSheep = (Sheep) super.clone();
            System.out.println("The sheep was cloned");
        } catch (CloneNotSupportedException e) {
            System.out.println("Sheep was not cloned");
            e.printStackTrace();
        }

        return clonedSheep;
    }
}

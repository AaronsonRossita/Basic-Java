package prototype;

public class PrototypeRunner {

    public static void main(String[] args) {

        CloneFactory cloneFactory = new CloneFactory();

        Sheep original = new Sheep("Dolly");
        Sheep cloned = (Sheep) cloneFactory.getClone(original);

        System.out.println(original.name);
        System.out.println(cloned.name);

        cloned.name = "Molly";

        System.out.println("original old name = " + original.name);
        System.out.println("cloned new name = " + cloned.name);

    }

}

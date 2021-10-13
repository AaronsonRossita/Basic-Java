package prototype;

public class CloneFactory {

    public Animal getClone(Animal animalPrototype){
        return animalPrototype.cloneAnimal();
    }

}

package ro.devmind.animals;

public class Dog implements IAnimal {

    private String animalName;

    public Dog(String animalName) {
        this.animalName = animalName;
    }

    @Override
    public String makeSound() {
        return "Dog " + animalName + ": woof!";
    }


}

package ro.devmind.animals;

public class Cat implements IAnimal {

    @Override
    public String makeSound() {
        return "Cat: meow!";
    }
}

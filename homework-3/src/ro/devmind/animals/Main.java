package ro.devmind.animals;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        IAnimal cat = ctx.getBean("myCat", IAnimal.class);
        IAnimal mouse = ctx.getBean("myMouse", IAnimal.class);
        Dog dog = ctx.getBean("myDog", Dog.class);

        System.out.println(dog.makeSound());
        System.out.println(cat.makeSound());
        System.out.println(mouse.makeSound());
    }
}
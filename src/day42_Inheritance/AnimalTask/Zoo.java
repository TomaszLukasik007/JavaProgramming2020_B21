package day42_Inheritance.AnimalTask;

public class Zoo {  // Zoo has a Tiger

    public static void main(String[] args) {

        Tiger tiger = new Tiger("Sher Khan", "bengal tiger", 'M', 5, "Orange", "large");


        System.out.println(tiger);
        tiger.eat("chcicken");
        tiger.hunt();
        tiger.roar();


        Cat cat = new Cat("Kiki", "Persian", 'F', 14, "White", "small");

        System.out.println(cat);
        cat.eat("Tuna");
        cat.drink("milk");
        cat.sleep();
        cat.meow();


        Dog dog = new Dog("Nina","American bull dog",'F',2,"White and brown","Big");

        System.out.println(dog);
        dog.eat("chicken");
        dog.drink("water");
        dog.sleep();
        dog.bark();

    }
}

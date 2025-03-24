public class AbstractionExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        animalBehaviour(dog);
        animalBehaviour(cat);
    }
//This method does not know whether animal is a Dog or Cat.
// It just calls eat() and sleep(),
// trusting that whatever object is passed in follows the Animal interface.
    static void animalBehaviour(Animal animal){
        System.out.println(animal + "eat");
         animal.eat();
        System.out.println(animal + "Sleep");
         animal.sleep();
    }

}

interface Animal{
    void eat();
    void sleep();
}

class Dog implements Animal {

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }

}

class Cat implements Animal {
    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }
}
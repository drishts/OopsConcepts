public class MethodOverridingExample {
    public static void main(String[] args) {
        Animal1 myanimal = new Bat();
        myanimal.speaks();
        myanimal = new Rat();
        myanimal.speaks();
    }


}

class Animal1{
    public void speaks() {

    }
}

class Bat extends Animal1{
    @Override
    public void speaks() {
        System.out.println("I am a cute bat");
    }
}

class Rat extends Animal1{
    @Override
    public void speaks() {
        System.out.println("I am a cute Rat");
    }


}


public class DataEncapsulationExample {
    public static void main(String[] args) {
        Cat1 cat = new Cat1();

        cat.setName("Whiskers");

        System.out.println("My cat's name is: " + cat.getName());
    }
}

class Cat1{
    String name;

    public String getName(){
        return name;
    }

    public void setName(String whiskers){
        this.name = name;
    }
}

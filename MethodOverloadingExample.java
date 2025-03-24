public class MethodOverloadingExample {
    public static void main(String[] args) {
        MathOpertions mathOpertions = new MathOpertions();
        System.out.println("Adding Integers : a and b" + mathOpertions.add(2,3));
        System.out.println("Adding three Integers : a, b and c " +mathOpertions.add(9,8, 23));
        System.out.println("Adding Double : a and b" +mathOpertions.add(8.0,9.34));
    }
}

class MathOpertions{
    public int add(int a , int b){

         return a+b;

    }

    public int add(int a , int b, int c){
        return a+b+c;

    }

    public double add(double a , double b){
        return  (a+b);

    }
}

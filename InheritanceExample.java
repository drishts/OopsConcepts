public class InheritanceExample {
    public static void main(String[] args) {
        B b = new B();  // Object of class B
        C c = new C();  // Object of class C
        D d = new D();  // Object of class D

        // ❌ Incorrect: B b = new A();
        // This line is commented out because it's incorrect.
        // The reason is that `A` is a parent class (superclass),
        // and `B` is a child class (subclass).
        // In Java, a parent class object (A) cannot be assigned to a child class reference (B)
        // because the parent class does not have all the properties of the child class.

        b.doingSomeWork();  // Calls method from class A (inherited)
        c.doingSomeWork();  // Calls method from class A (inherited)
        d.doingSomeWork();  // Calls method from class A (inherited via C)

        // ✅ Correct: Assigning child object (B) to parent reference (A)
        A a = new B();
        a.doingSomeWork(); // Calls method from A (or overridden version if present in B)
    }
}

// Base class (Parent class)
class A {
    void doingSomeWork() {
        System.out.println("Doing some work");
    }
}

// 📌 **Single Inheritance**: Class B inherits from Class A
class B extends A {
}

// 📌 **Single Inheritance**: Class C inherits from Class A
class C extends A {
}

// 📌 **Hierarchical Inheritance**: Class D inherits from Class C
class D extends C {
}

// ❌ **Multiple Inheritance using classes is NOT allowed in Java**
// The following line is incorrect because Java does not support multiple inheritance with classes:
// class E extends A, C {} // 🚨 ERROR: Java does not support multiple inheritance with classes.





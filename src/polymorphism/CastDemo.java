package polymorphism;

class Animal {
    String name = "Animal";

    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    String name = "Dog"; // field hiding, không override field

    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    void wagTail() {
        System.out.println("Dog wags tail");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class CastDemo {
    public static void main(String[] args) {
        // UPCASTING (implicit)
        Animal a = new Dog(); // upcast: Dog -> Animal
        a.sound();            // Dog barks   (runtime polymorphism)
        System.out.println(a.name); // prints "Animal" (field access uses reference type)

        // a.wagTail(); // ❌ Compile error: method wagTail() không có trong Animal

        // DOWNCASTING (explicit)
        if (a instanceof Dog) {      // safe check
            Dog d = (Dog) a;         // downcast
            d.wagTail();             // OK: Dog specific method
        }

        // Unsafe downcast -> ClassCastException at runtime
        Animal a2 = new Cat();
        // Dog d2 = (Dog) a2; // compiles but at runtime: ClassCastException

        // Using instanceof pattern (Java 16+)
        Object obj = new Dog();
        if (obj instanceof Dog dog) { // pattern matching
            dog.wagTail(); // safe and shorter
        }
    }
}


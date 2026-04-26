package myabstract; 

// abstract class (lớp trừu tượng)
abstract class Animal {
    String name;

    // Constructor
    Animal(String name) {
        this.name = name;
    }

    // Phương thức trừu tượng — chỉ khai báo, chưa có nội dung
    abstract void makeSound();

    // Phương thức bình thường — có nội dung sẵn
    void sleep() {
        System.out.println(name + " is sleeping...");
    }
}

// Lớp con Dog kế thừa từ Animal
class Dog extends Animal {
    Dog(String name) {
        super(name); // Gọi constructor của lớp cha
    }

    // Ghi đè (override) phương thức makeSound()
    @Override
    void makeSound() {
        System.out.println(name + " says: Woof woof!");
    }
}

// Lớp con Cat kế thừa từ Animal
class Cat extends Animal {
    Cat(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println(name + " says: Meow~");
    }
}

// Lớp Main để chạy chương trình
public class knowledge {
    public static void main(String[] args) {
        // Không thể tạo trực tiếp đối tượng từ abstract class:
        // Animal a = new Animal("Something");  // ❌ lỗi biên dịch

        // ✅ Tạo đối tượng từ lớp con
        Dog dog = new Dog("Milu");
        Cat cat = new Cat("Kitty");

        dog.makeSound();  // Milu says: Woof woof!
        cat.makeSound();  // Kitty says: Meow~
        dog.sleep();      // Milu is sleeping...
    }
}

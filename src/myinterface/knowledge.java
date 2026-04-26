package myinterface;

// File: Main.java

// Interface mô tả hành vi "biết bay"
interface Flyable {
    void fly(); // chưa có thân hàm
}

// Interface mô tả hành vi "biết bơi"
interface Swimmable {
    void swim();
}

// Interface mô tả hành vi "biết kêu"
interface Animal {
    void makeSound();
}

// Lớp Bird kế thừa (implements) nhiều interface cùng lúc
class Bird implements Animal, Flyable {
    public void makeSound() {
        System.out.println("Bird says: Tweet Tweet!");
    }
    public void fly() {
        System.out.println("Bird is flying high in the sky!");
    }
}

// Lớp Fish cũng implements interface nhưng hành vi khác
class Fish implements Animal, Swimmable {
    public void makeSound() {
        System.out.println("Fish says: Blub Blub!");
    }
    public void swim() {
        System.out.println("Fish is swimming in the water!");
    }
}

// Lớp Dog chỉ implements Animal (vì không bay, không bơi)
class Dog implements Animal {
    public void makeSound() {
        System.out.println("Dog says: Woof Woof!");
    }
}

// Chương trình chính
public class knowledge {
    public static void main(String[] args) {
        // Tạo đối tượng từ các lớp khác nhau
        Bird b = new Bird();
        Fish f = new Fish();
        Dog d = new Dog();

        // Gọi các hành vi
        b.makeSound();
        b.fly();

        f.makeSound();
        f.swim();

        d.makeSound();
    }
}


//interface khá giống vs abtract là chỉ phác thảo ra, và hàm con bắt buộc phải có method, khác ở chỗ là abtract có thể có thuộc tính có thể thể 
// có những method bình thường không phải method abstract, nhưng interface thì khác, nó chỉ có nhưng method được mô tả chứ không có code
// và bắt buộc lớp con phải có những method đó, abtract có thể extends 1 lần, nhưng interface thì implement vô số đều được, được thừa kế từ 
// vô số hàm cha, như ví dụ ở trên 
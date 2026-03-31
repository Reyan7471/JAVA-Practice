// Class
class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}

// Object
class Student {
    String name;

    public static void main(String[] args) {
        Student s = new Student();
        s.name = "John";
        System.out.println(s.name);
    }
}

// Encapsulation
class EncapsulationExample {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        EncapsulationExample e = new EncapsulationExample();
        e.setName("Encapsulation");
        System.out.println(e.getName());
    }
}

// Inheritance
class Bird {
    void eat() {
        System.out.println("Eating...");
    }
}

class Peacock extends Bird {
    void dance() {
        System.out.println("Dancing...");
    }

    public static void main(String[] args) {
        Peacock p = new Peacock();
        p.eat();
        p.dance();
    }
}

// Polymorphism
class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking...");
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();
    }
}

// Method Overloading
class OverloadingExample {
    void display(int a) {
        System.out.println("Integer: " + a);
    }

    void display(String s) {
        System.out.println("String: " + s);
    }

    public static void main(String[] args) {
        OverloadingExample o = new OverloadingExample();
        o.display(10);
        o.display("Overloading");
    }
}

// Method Overriding
class Animal1 {
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog1 extends Animal1 {
    void eat() {
        System.out.println("Dog is eating...");
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
    }
}

// Abstraction
abstract class Vehicle {
    abstract void run();
}

class Car extends Vehicle {
    void run() {
        System.out.println("Car is running...");
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.run();
    }
}

// Interface
interface Drawable {
    void draw();
}

class Circle1 implements Drawable {
    public void draw() {
        System.out.println("Drawing Circle...");
    }

    public static void main(String[] args) {
        Circle1 c = new Circle1();
        c.draw();
    }
}


// Student Class

class Student {
    int id;
    String name;

    public static void main(String[] args) {
        Student s = new Student();
        s.id = 1;
        s.name = "Reyan";
        System.out.println(s.id + " " + s.name);
    }
}

// Valid Identifiers
class ValidIdentifiers {
    int _id; // valid
    String name$; // valid
    double $salary; // valid

    public static void main(String[] args) {
        ValidIdentifiers v = new ValidIdentifiers();
        v._id = 1;
        v.name$ = "Valid";
        v.$salary = 50000.0;
        System.out.println(v._id + " " + v.name$ + " " + v.$salary);
    }
}

// Class and Object

class Car {
    String model;

    public static void main(String[] args) {
        Car c = new Car();
        c.model = "BMW";
        System.out.println(c.model);
    }
}

// Constructor Example

class Test {
    Test() {
        System.out.println("Object Created");
    }

    public static void main(String[] args) {
        new Test();
    }
}

// Variable

class Table {
    int a = 10;        // instance
    static int b = 20; // static

    public static void main(String[] args) {
        Table d = new Table();
        int c = 30;    // local

        System.out.println(d.a);
        System.out.println(b);
        System.out.println(c);
    }
}

// Access Modifiers

class ModifierExample {
    private int a = 10;   // private variable
    public int b = 20;    // public variable

    void show() {
        System.out.println("Private: " + a);
        System.out.println("Public: " + b);
    }

    public static void main(String[] args) {
        ModifierExample d = new ModifierExample();
        d.show();
    }
}

// Static Method
class StaticMethodExample {
    static void display() {
        System.out.println("Static Method Called");
    }

    public static void main(String[] args) {
        display(); // calling static method without creating an object
    }
}

// Final Keyword
class FinalExample {
    final int a = 10; // final variable

    void show() {
        // a = 20; // error: cannot assign a value to final variable
        System.out.println("Final Variable: " + a);
    }

    public static void main(String[] args) {
        FinalExample d = new FinalExample();
        d.show();
    }
}

// Enum Example
enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

class EnumExample {
    public static void main(String[] args) {
        Day today = Day.MONDAY;
        System.out.println("Today is: " + today);
    }
}

// Intermediate Level Concepts

// Abstarction Example
abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}

class AbstractionExample {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();
    }
}

// Interface Example
interface Drawable {
    void draw();
}

class Rectangle implements Drawable {
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}

class InterfaceExample {
    public static void main(String[] args) {
        Drawable d = new Rectangle();
        d.draw();
    }
}

// Method + Variable

class MethodVariableExample {
    int a = 10; // instance variable

    void display() {
        int b = 20; // local variable
        System.out.println("Instance Variable: " + a);
        System.out.println("Local Variable: " + b);
    }

    public static void main(String[] args) {
        MethodVariableExample d = new MethodVariableExample();
        d.display();
    }
}

// Advanced Level Concepts

// Bank Account Example
class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        account.deposit(500);
        account.withdraw(200);
        System.out.println("Current Balance: " + account.getBalance());
    }
}

// Access Control Example
class AccessControlExample {
    private String secret = "This is a secret message";
    public String getSecret() {
        return secret;
    }
    
    public static void main(String[] args) {
        AccessControlExample example = new AccessControlExample();
        System.out.println("Secret: " + example.getSecret());
    }
}

public class Main {
    // state of an object
    int age;
    String name;

    // behavior of an object
    public void set_value() {
        age = 20;
        name = "Robin";
    }
    public void get_value() {
        System.out.println("Age is " + age);
        System.out.println("Name is " + name);
    }

    // main method
    public static void main(String [] args) {
        // creates a new Person object
        Main p = new Main();

        // changes state through behavior
        p.set_value();
    }
}
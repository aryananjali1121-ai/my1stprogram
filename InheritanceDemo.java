class Parent {
    void displayMessage() {
        System.out.println("This is the Parent class");
    }
}
class Child extends Parent {
    void showMessage() {
        System.out.println("This is the Child class");
    }
}
public class InheritanceDemo {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.displayMessage();
        obj.showMessage();
    }
}

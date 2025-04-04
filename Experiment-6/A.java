package p;

public class A {
    public void publicMethod() {
        System.out.println("Public method is accessible everywhere.");
    }

    protected void protectedMethod() {
        System.out.println("Protected method is accessible within the same package and subclasses.");
    }

    void defaultMethod() { //default
        System.out.println("Default method is accessible within the same package.");
    }

    private void privateMethod() {
        System.out.println("Private method is accessible only within the same class.");
    }

    public void accessPrivateMethod() {
        privateMethod();  // Private method
    }
}

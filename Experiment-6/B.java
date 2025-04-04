package q;
import p.A;  // Import class A from package p

public class B extends A { // Extending class A 
    public static void main(String[] args) {
        A obj = new A();  // Creating object of class A

        // Accessing methods from class A
        obj.publicMethod();  // Public method is accessible anywhere

        // protectedMethod() not Allowed
        // defaultMethod() not Allowed, Not accessible outside the package
        // privateMethod() not Allowed, never accessible

        // accessing protected method
        B objB = new B();
        objB.protectedMethod();  // accessing through subclass inheritance

        // private method access indirectly
        obj.accessPrivateMethod();  // calls private method inside A
    }
}

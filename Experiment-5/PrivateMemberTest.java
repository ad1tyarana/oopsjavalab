class SuperClass {
    private int privateData = 42; // private member
    public int getPrivateData() {
        return privateData;
    }
}
class SubClass extends SuperClass {
    public void display() {
        //System.out.println("Private Data: " + privateData);  //error
        System.out.println("Private Data (via getter): " + getPrivateData());      //accessing private subclass
    }
}
public class PrivateMemberTest {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.display();
    }
}

import java.util.Scanner;
abstract class TrunkCall {
    protected int duration; 
    public TrunkCall(int duration) {
        this.duration = duration;}
    public abstract double calculateCharge();
}
class OrdinaryCall extends TrunkCall {
    private static final double RATE_PER_MINUTE = 1.0;
    public OrdinaryCall(int duration) {
        super(duration);}
    public double calculateCharge() {
        return duration * RATE_PER_MINUTE;}
}
class UrgentCall extends TrunkCall {
    private static final double RATE_PER_MINUTE = 2.0;
    public UrgentCall(int duration) {
        super(duration);}
    public double calculateCharge() {
        return duration * RATE_PER_MINUTE;}
}
class LightningCall extends TrunkCall {
    private static final double RATE_PER_MINUTE = 3.0; 
    public LightningCall(int duration) {
        super(duration);}
    public double calculateCharge() {
        return duration * RATE_PER_MINUTE;}
}
public class TrunkCallMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter call duration (in minutes): ");
        int duration = scanner.nextInt();
        System.out.println("Select call type: ");
        System.out.println("1. Ordinary");
        System.out.println("2. Urgent");
        System.out.println("3. Lightning");
        System.out.print("Enter choice (1-3): ");
        int choice = scanner.nextInt();
        TrunkCall call;
        switch (choice) {
            case 1:
                call = new OrdinaryCall(duration);
                break;
            case 2:
                call = new UrgentCall(duration);
                break;
            case 3:
                call = new LightningCall(duration);
                break;
            default:
                System.out.println("Invalid choice. Exiting program.");
                scanner.close();
                return;
        }
        System.out.println("Total charge: $" + call.calculateCharge());
        scanner.close();
    }
}

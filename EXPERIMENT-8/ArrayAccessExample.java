import java.util.Scanner;

public class ArrayAccessExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter an index (0 to 4): ");
            int index = scanner.nextInt();
            System.out.println("Element at index " + index + " : " + numbers[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index. Please enter a value between 0 and 4.");
        } finally {
            System.out.println("Array access attempted.");
            scanner.close();
        }
    }
}

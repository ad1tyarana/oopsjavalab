import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of terms for the Fibonacci series: ");
        int n = s.nextInt();
        
        if (n <= 0) {
            System.out.println("No elements to print");
        } else if (n == 1) {
            System.out.println("Fibonacci Series: " + 0);
        } else {
            System.out.print("Fibonacci Series: ");
            int a = 0, b = 1;
            System.out.print(a + " " + b); 
            
            for (int i = 2; i < n; i++) { 
                int x = a + b; 
                System.out.print(" " + x);
                a = b; 
                b = x;
            }
        }
        s.close(); 
    }
}

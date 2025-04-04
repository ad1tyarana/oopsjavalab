public class pattern {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) { // Odd rows
                System.out.println("?".repeat(i).trim()+"?".repeat(i-1).trim());
            } else { // Even rows
                System.out.println("#".repeat(i).trim()+"#".repeat(i-1).trim());
            }
        }
    }
}

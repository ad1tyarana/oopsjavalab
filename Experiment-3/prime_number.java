public class prime_number {
    public static void main(String[] args) { 
        int i, count, primeCount = 0;

        for (int num = 2; num <= 1000; num++) {
            count = 0; 

            for (i = 2; i <= Math.sqrt(num); i++) { 
                if (num % i == 0) {
                    count = 1; 
                    break; 
                }
            }

            if (count == 0) { 
                primeCount++;
            }
        }

        System.out.println("\nTotal number of prime numbers between 1 and 1000: " + primeCount);
    }
}

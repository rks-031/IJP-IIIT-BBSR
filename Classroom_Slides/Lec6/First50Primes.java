public class First50Primes {
        public static void main(String[] args) {
                final int NUMBER_OF_PRIMES = 50; // Number of prime numbers to display
                final int PRIMES_PER_LINE = 10; // Number of primes per line
                int count = 0; // Count of prime numbers found
                int number = 2; // Number to test for primality

                System.out.println("The first 50 prime numbers are:");

                // Loop until the required number of prime numbers are found
                while (count < NUMBER_OF_PRIMES) {
                        if (isPrime(number)) {
                                count++;

                                // Print the prime number and format the output
                                System.out.printf("%-4d", number);

                                // Print newline after every 10 numbers
                                if (count % PRIMES_PER_LINE == 0) {
                                        System.out.println();
                                }
                        }

                        number++;
                }
        }

        public static boolean isPrime(int number) {
                if (number <= 1) {
                        return false;
                }
                for (int i = 2; i <= Math.sqrt(number); i++) {
                        if (number % i == 0) {
                                return false;
                        }
                }
                return true;
        }
}

import java.util.Scanner;

public class SumWithSentinel {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                System.out.println("Enter integers (0 to end):");

                int sum = 0;
                int input;

                while (true) {
                        input = sc.nextInt();

                        if (input == 0) {
                                break; // Exit the loop if the input is 0
                        }

                        sum += input;
                }

                System.out.println("Sum of entered integers: " + sum);

                sc.close();
        }
}

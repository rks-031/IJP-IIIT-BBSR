import java.util.Scanner;

public class NumberDivisibilityCheck {
        public static void main(String[] args) {
                System.out.println("Enter a number");
                Scanner sc = new Scanner(System.in);
                int num = sc.nextInt();

                boolean divisibleBy2And3 = (num % 2 == 0) && (num % 3 == 0);
                boolean divisibleBy2Or3 = (num % 2 == 0) || (num % 3 == 0);
                boolean divisibleBy2Or3ButNotBoth = (num % 2 == 0) ^ (num % 3 == 0);

                System.out.println("Number " + num);
                System.out.println("Divisible by 2 and 3: " + divisibleBy2And3);
                System.out.println("Divisible by 2 or 3: " + divisibleBy2Or3);
                System.out.println("Divisible by 2 or 3 but not both: " + divisibleBy2Or3ButNotBoth);

                sc.close();
        }
}

import java.util.Scanner;

public class GCD {
        public static int findGCD(int num1, int num2) {
                int result = 0;
                if (num1 == num2) {
                        result = num1;
                }
                if (num1 > num2) {
                        return findGCD(num1 - num2, num2);
                }
                if (num2 > num1) {
                        return findGCD(num1, num2 - num1);
                }
                return result;
        }

        public static void main(String[] args) {
                System.out.println("Enter two numbers:");
                int num1, num2;
                Scanner sc = new Scanner(System.in);
                num1 = sc.nextInt();
                num2 = sc.nextInt();
                int gcd = findGCD(num1, num2);
                System.out.println("GCD is " + gcd);

                sc.close();
        }
}

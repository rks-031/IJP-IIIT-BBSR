import java.util.*;

public class Palindrome {
        public static void main(String[] args) {
                System.out.println("enter a 3 digit integer");
                Scanner sc = new Scanner(System.in);
                int num = sc.nextInt();

                int rem, rev = 0;
                int num1 = num;

                while (num1 != 0) {
                        rem = num1 % 10;
                        rev = rev * 10 + rem;
                        num1 /= 10;
                }

                System.out.println((rev == num ? "Palindrome" : "Not a plaindrome"));

                sc.close();
        }
}

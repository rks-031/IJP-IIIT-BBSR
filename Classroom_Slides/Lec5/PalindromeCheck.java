import java.util.Scanner;

public class PalindromeCheck {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                String input = sc.next();
                boolean isPalindrome = isPalindromeIgnoringNonAlphanumeric(input);

                System.out.println("Input: " + input);
                System.out.println("Is palindrome ignoring non-alphanumeric characters? " + isPalindrome);

                sc.close();
        }

        public static boolean isPalindromeIgnoringNonAlphanumeric(String str) {
                // Remove non-alphanumeric characters and convert to lowercase
                String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

                int left = 0;
                int right = cleanedStr.length() - 1;

                while (left < right) {
                        if (cleanedStr.charAt(left) != cleanedStr.charAt(right)) {
                                return false;
                        }
                        left++;
                        right--;
                }

                return true;
        }
}

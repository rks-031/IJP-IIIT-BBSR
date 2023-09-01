import java.util.Scanner;

public class PalindromicString {
        public static boolean palindrome(String str, int start, int end) {
                StringBuilder sb = new StringBuilder(str);
                while (start <= end) {
                        char temp = sb.charAt(start);
                        sb.setCharAt(start, sb.charAt(end));
                        sb.setCharAt(end, temp);
                        start++;
                        end--;
                }
                String reversedStr = sb.toString();
                return str.equals(reversedStr);
        }

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                String str = sc.next();
                int length = str.length();
                boolean value = palindrome(str, 0, length - 1);
                System.out.println(value ? "Palindrome" : "Not a palindrome");

                sc.close();
        }
}

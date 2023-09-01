import java.util.*;

public class CheckISBN {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int size = 10;
                int digit[] = new int[size];

                System.out.print("Enter the first 9 of an ISBN as an integer: ");
                for (int i = 0; i < 9; i++) {
                        digit[i] = sc.nextInt();
                }

                int sum = 0;
                for (int i = 1; i <= 9; i++) {
                        sum += digit[i - 1] * i;
                }

                int checkSum = sum % 11;
                if (checkSum == 10) {
                        for (int i = 0; i < 9; i++) {
                                System.out.print(digit[i]);
                        }
                        System.out.println("X");
                } else {
                        digit[9] = checkSum;
                        for (int i = 0; i < 10; i++) {
                                System.out.print(digit[i]);
                        }
                }

                sc.close();
        }
}

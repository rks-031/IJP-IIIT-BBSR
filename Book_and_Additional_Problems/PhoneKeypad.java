import java.util.Scanner;

public class PhoneKeypad {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Enter a letter: ");
                char letter = scanner.next().charAt(0);
                scanner.close();

                int digit = getPhoneKeypadDigit(letter);

                if (digit != -1) {
                        System.out.println("The corresponding digit for '" + letter + "' is: " + digit);
                } else {
                        System.out.println("'" + letter + "' is not a valid letter for the phone keypad.");
                }
        }

        public static int getPhoneKeypadDigit(char letter) {
                char uppercaseLetter = Character.toUpperCase(letter);

                if ('A' <= uppercaseLetter && uppercaseLetter <= 'C') {
                        return 2;
                } else if ('D' <= uppercaseLetter && uppercaseLetter <= 'F') {
                        return 3;
                } else if ('G' <= uppercaseLetter && uppercaseLetter <= 'I') {
                        return 4;
                } else if ('J' <= uppercaseLetter && uppercaseLetter <= 'L') {
                        return 5;
                } else if ('M' <= uppercaseLetter && uppercaseLetter <= 'O') {
                        return 6;
                } else if ('P' <= uppercaseLetter && uppercaseLetter <= 'S') {
                        return 7;
                } else if ('T' <= uppercaseLetter && uppercaseLetter <= 'V') {
                        return 8;
                } else if ('W' <= uppercaseLetter && uppercaseLetter <= 'Z') {
                        return 9;
                }

                return -1;
        }
}

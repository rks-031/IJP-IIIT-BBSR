import java.util.Scanner;

public class MajorAndStatus {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter two characters (Major and Status):");
                char c1 = sc.next().charAt(0);
                char c2 = sc.next().charAt(0);

                if (c1 == 'M') {
                        System.out.print("Mathematics ");
                } else if (c1 == 'C') {
                        System.out.print("Computer Science ");
                } else {
                        System.out.print("Information Technology ");
                }

                if (c2 == '1') {
                        System.out.println("Freshman");
                } else if (c2 == '2') {
                        System.out.println("Junior");
                } else if (c2 == '3') {
                        System.out.println("Senior");
                } else {
                        System.out.println("Invalid status");
                }

                sc.close();
        }
}

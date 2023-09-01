import java.util.Scanner;

public class Multiplication {
        public static void main(String[] args) {
                System.out.println("Generate multiplication tables up to which number?");
                Scanner sc = new Scanner(System.in);
                int limit = sc.nextInt();

                for (int num = 1; num <= limit; num++) {
                        System.out.println("Multiplication table for " + num + ":");

                        for (int i = 1; i <= 10; i++) {
                                System.out.println(num + " * " + i + " = " + num * i);
                        }

                        System.out.println(); // Add a blank line after each multiplication table
                }

                sc.close();
        }
}

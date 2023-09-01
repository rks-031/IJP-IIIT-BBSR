import java.util.*;

public class GenerateInteger {
        public static void main(String[] args) {
                Random random = new Random();
                int randomNumber = random.nextInt(101);
                // System.out.println("Generated Number:" + randomNumber);
                int num = -1;
                while (randomNumber != num) {
                        System.out.println("Enter a number");
                        Scanner sc = new Scanner(System.in);
                        num = sc.nextInt();
                        sc.close();
                }

        }
}

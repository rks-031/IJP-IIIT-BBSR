import java.util.*;

public class Hi {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter an integer");
                int num = sc.nextInt();

                if (num % 5 == 0) {
                        System.out.println("HiFive");
                } else if (num % 2 == 0) {
                        System.out.println("HiEven");
                }

                sc.close();
        }
}

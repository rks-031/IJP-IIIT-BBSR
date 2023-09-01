import java.util.Scanner;

public class Displacement {
        public static double displace(double u, double t, double a) {
                return u * t + 0.5 * a * Math.pow(t, 2);
        }

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter initial velocity, acceleration and time");
                double u = sc.nextDouble();
                double a = sc.nextDouble();
                int t = sc.nextInt();

                double ans = displace(u, t, a);
                System.out.println("Displacement: " + ans + " units.");

                sc.close();
        }
}

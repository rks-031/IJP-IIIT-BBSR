import java.util.*;

public class Quadratic {
        public static void main(String[] args) {
                double a, b, c;
                System.out.println("Enter the values of a, b and c");
                Scanner sc = new Scanner(System.in);
                a = sc.nextDouble();
                b = sc.nextDouble();
                c = sc.nextDouble();

                double d = Math.pow(b, 2) - 4 * a * c;
                double r1, r2;
                if (d > 0) {
                        System.out.println("Two roots");
                        r1 = (-b + Math.sqrt(d)) / 2 * a;
                        r2 = (-b - Math.sqrt(d)) / 2 * a;
                        System.out.println("r1: " + r1 + ", r2: " + r2);
                } else if (d == 0) {
                        System.out.println("Single root");
                        r1 = (-b) / 2 * a;
                        System.out.println("r1: " + r1);
                } else {
                        System.out.println("The eauqtion has no real roots");
                }
                sc.close();
        }
}

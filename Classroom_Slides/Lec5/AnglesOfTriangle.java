import java.util.*;

public class AnglesOfTriangle {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int x1, x2, x3, y1, y2, y3;
                System.out.println("Enter all the vertices of the triangle in the form of(xi,yi)");
                x1 = sc.nextInt();
                y1 = sc.nextInt();
                x2 = sc.nextInt();
                y2 = sc.nextInt();
                x3 = sc.nextInt();
                y3 = sc.nextInt();

                double a = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
                double b = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
                double c = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));

                double A = Math.toDegrees(Math.acos((Math.pow(b, 2) + Math.pow(c, 2) - Math.pow(a, 2)) / (2 * b * c)));
                double B = Math.toDegrees(Math.acos((Math.pow(a, 2) + Math.pow(c, 2) - Math.pow(b, 2)) / (2 * a * c)));
                double C = Math.toDegrees(Math.acos((Math.pow(b, 2) + Math.pow(a, 2) - Math.pow(c, 2)) / (2 * a * b)));

                System.out.println("Angles are: " + A + " " + B + " " + C);

                sc.close();

        }
}

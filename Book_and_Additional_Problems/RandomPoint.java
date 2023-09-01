public class RandomPoint {
        public static void main(String[] args) {
                double r = 40.0;
                double A = Math.random() * (2 * Math.PI);
                double B = Math.random() * (2 * Math.PI);
                double C = Math.random() * (2 * Math.PI);

                double x1 = r * Math.cos(A);
                double y1 = r * Math.sin(A);
                double x2 = r * Math.cos(B);
                double y2 = r * Math.sin(B);
                double x3 = r * Math.cos(C);
                double y3 = r * Math.sin(C);

                if (A + B + C == 180.0) {
                        System.out.println("The three random coordinates on the triangle can be:");
                        System.out.println("(" + x1 + " " + y1 + ")");
                        System.out.println("(" + x2 + " " + y2 + ")");
                        System.out.println("(" + x3 + " " + y3 + ")");
                } else {
                        System.out.println("Invalid angles");
                }

        }
}

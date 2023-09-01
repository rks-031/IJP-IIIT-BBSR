package Lec2;
import java.util.Scanner;

public class Cylinder {
        public static void main(String[] args) {
                double pi = 3.145;
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the values of radius and length of the cylinder");
                double radius = sc.nextDouble();
                double length = sc.nextDouble();

                double area = radius * radius * pi;
                System.out.println("Area of the cylinder: " + area + " sq. units.");
                double vol = area * length;
                System.out.println("Volume of the cylinder: " + vol + " cu. units");

                sc.close();
        }
}

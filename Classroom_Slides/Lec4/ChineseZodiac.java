package Lec4;
import java.util.Scanner;

public class ChineseZodiac {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter year");
                int year = sc.nextInt();

                int zodiacValue = year % 12;

                switch (zodiacValue) {
                        case 0:
                                System.out.println("monkey");
                                break;

                        case 1:
                                System.out.println("rooster");
                                break;

                        case 2:
                                System.err.println("dog");
                                break;

                        case 3:
                                System.out.println("pig");
                                break;

                        case 4:
                                System.out.println("rat");
                                break;

                        case 5:
                                System.out.println("ox");
                                break;

                        case 6:
                                System.out.println("tiger");
                                break;

                        case 7:
                                System.out.println("rabbit");
                                break;

                        case 8:
                                System.out.println("dragon");
                                break;

                        case 9:
                                System.out.println("snake");
                                break;

                        case 10:
                                System.out.println("horse");
                                break;

                        case 11:
                                System.out.println("sheep");
                                break;

                        default:
                                System.out.println("Enter valid year");

                                sc.close();
                }
        }
}

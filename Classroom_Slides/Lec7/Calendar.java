package Classroom_Slides.Lec7;

import java.util.Scanner;

public class Calendar {
        public static void main(String[] args) {
                Scanner input = new Scanner(System.in);

                System.out.print("Enter year: ");
                int year = input.nextInt();

                System.out.print("Enter month (1-12): ");
                int month = input.nextInt();

                printCalendar(year, month);

                input.close();
        }

        public static void printCalendar(int year, int month) {
                int daysInMonth = getDaysInMonth(year, month);
                int firstDayOfWeek = getFirstDayOfWeek(year, month);
                String mName = "";
                switch (month) {
                        case 1:
                                mName = "January";
                                break;
                        case 2:
                                mName = "February";
                                break;
                        case 3:
                                mName = "March";
                                break;
                        case 4:
                                mName = "April";
                                break;
                        case 5:
                                mName = "May";
                                break;
                        case 6:
                                mName = "June";
                                break;
                        case 7:
                                mName = "July";
                                break;
                        case 8:
                                mName = "August";
                                break;
                        case 9:
                                mName = "September";
                                break;
                        case 10:
                                mName = "October";
                                break;
                        case 11:
                                mName = "November";
                                break;
                        case 12:
                                mName = "December";
                                break;
                }
                System.out.println();
                System.out.println("----------------------------");
                System.out.println(" " + mName + " -" + year);
                System.out.println("----------------------------");
                System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
                System.out.println("----------------------------");

                for (int i = 0; i < firstDayOfWeek; i++) {
                        System.out.print("    ");
                }

                for (int i = 1; i <= daysInMonth; i++) {
                        System.out.printf("%4d", i);

                        if ((i + firstDayOfWeek) % 7 == 0) {
                                System.out.println();
                        }
                }
                System.out.println();
                System.out.println("----------------------------");

        }

        public static int getDaysInMonth(int year, int month) {
                int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

                if (month == 2 && isLeapYear(year)) {
                        return 29;
                }

                return daysInMonth[month - 1];
        }

        public static boolean isLeapYear(int year) {
                return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        }

        public static int getFirstDayOfWeek(int year, int month) {
                int dayOfWeekJan1 = getDayOfWeek(year, 1, 1);
                int daysFromJan1ToMonth1 = getDaysFromJan1ToMonth1(year, month);

                return (dayOfWeekJan1 + daysFromJan1ToMonth1 - 1) % 7;
        }

        public static int getDayOfWeek(int year, int month, int dayOfMonth) {
                if (month == 1 || month == 2) {
                        month += 12;
                        year--;
                }

                int k = year % 100;
                int j = year / 100;

                return (dayOfMonth + (13 * (month + 1)) / 5 + k + k / 4 + j / 4 + 5 * j) % 7;
        }

        public static int getDaysFromJan1ToMonth1(int year, int month) {
                int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

                if (month == 1 || month == 2) {
                        return daysInMonth[month - 1];
                } else {
                        return daysInMonth[month - 1] + (isLeapYear(year) ? -2 : -3);
                }
        }
}
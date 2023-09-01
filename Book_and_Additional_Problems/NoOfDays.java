import java.util.Scanner;

public class NoOfDays {
        public static void main(String[] args) {
                System.out.print("Enter month and year: ");

                Scanner sc = new Scanner(System.in);
                int month = sc.nextInt();
                int year = sc.nextInt();

                String months[] = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sept", "Oct", "Nov",
                                "Dec" };

                int NoOfDays;

                if (month == 2) {
                        // checking for leap year
                        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                                NoOfDays = 29;
                        } else {
                                NoOfDays = 28;
                        }
                } else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10
                                || month == 12) {
                        NoOfDays = 31;
                } else {
                        NoOfDays = 30;
                }

                System.out.println(months[month - 1] + " " + year + " had " + NoOfDays + " days.");

                sc.close();
        }
}

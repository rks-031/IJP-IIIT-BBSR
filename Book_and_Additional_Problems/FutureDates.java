import java.util.*;

public class FutureDates {
        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                System.out.print("Enter today's day: ");
                int today = sc.nextInt(); // 0 to 6
                System.out.print("Enter the number of days elapsed since today: ");
                int future = sc.nextInt();
                String days[] = { "Sunday", "Monday", "Wednesday", "Thursday", "Friday", "Saturday" };

                String currDay = days[today];

                String futDay = days[((today + future) % 7) - 1];

                System.out.println("Today is " + currDay + " and the future day is " + futDay);

                sc.close();
        }
}

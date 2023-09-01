import java.util.*;

public class AdditionQuiz {
        public static void main(String[] args) {
                int num1 = (int) (Math.random() * 10);
                int num2 = (int) (Math.random() * 10);

                System.out.println("What is " + num1 + " + " + num2 + " ? ");
                Scanner sc = new Scanner(System.in);
                int answer = sc.nextInt();
                int join = num1 + num2;

                System.out.println(join == answer ? "Correct" : "Incorrect");

                sc.close();
        }
}

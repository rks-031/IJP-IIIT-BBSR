import java.util.Scanner;

public class BinaryOperations {

        public static int operate(int num1, int num2, char operator) {
                int result = 0;
                switch (operator) {
                        case '+':
                                result = num1 + num2;
                                break;
                        case '-':
                                result = num1 - num2;
                                break;
                        case '/':
                                result = num1 / num2;
                                break;
                        case '*':
                                result = num1 * num2;
                                break;
                }
                return result;
        }

        public static void main(String[] args) {
                System.out.println("Enter two inegers and an operator");
                Scanner sc = new Scanner(System.in);

                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                String input = sc.next();
                char operator = input.charAt(0);

                int result = operate(num1, num2, operator);
                System.out.println(result);

                sc.close();
        }
}

package Classroom_Slides.Lec7;
public class DecimalToHex {
        public static String toHex(int decimal) {
                int rem;
                String hex = "";
                char hexchars[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
                while (decimal > 0) {
                        rem = decimal % 16;
                        hex = hexchars[rem] + hex;
                        decimal = decimal / 16;
                }
                return hex;
        }

        public static int toDec(String hex) {
                String digits = "0123456789ABCDEF";
                hex = hex.toUpperCase();
                int val = 0;
                for (int i = 0; i < hex.length(); i++) {
                        char c = hex.charAt(i);
                        int d = digits.indexOf(c);
                        val = 16 * val + d;
                }
                return val;
        }

        public static void main(String args[]) {
                System.out.println("Hexadecimal of 15 is: " + toHex(15));
                System.out.println("Hexadecimal of 100 is: " + toHex(100));
                System.out.println("Hexadecimal of 255 is: " + toHex(255));
                System.out.println("Decimal of F is: " + toDec("F"));
                System.out.println("Decimal of 64 is: " + toDec("64"));
                System.out.println("Decimal of FF is: " + toDec("FF"));

        }
}
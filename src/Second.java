
import java.util.Scanner;

    public class Second {
        public static void main(String[] args) {

            System.out.println("Введіть двозначне  число:");
            Scanner one = new Scanner(System.in);

            int a = one.nextInt();
            int b = a / 10;
            int c = a % 10;

            System.out.println(b + c);

        }
    }



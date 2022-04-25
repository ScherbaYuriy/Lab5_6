
import java.util.Scanner;

    public class Third {

        public static void main(String[] args) {
            System.out.print("Вкажіть число для округлення: ");
            Scanner one = new Scanner(System.in);
            double a = one.nextDouble();
            int b = (int) a;
            double c = (a - b);
            double x = c + 0.5;
            int d = (int) a + (int) x;
            System.out.println(d);

        }
    }


import java.util.Scanner;

    public class First {
        public static void main(String[]args) {
            System.out.println("Введіть число:");
            Scanner first = new Scanner(System.in);
            int number_1 = first.nextInt();
            System.out.println("Введіть наступне число:");
            Scanner second = new Scanner(System.in);
            int number_2 = second.nextInt();
            int a = number_1 / number_2;
            int b = number_1 % number_2;
            System.out.println("Результат:" + a);
            System.out.println("Результат:" + b);


    }

}

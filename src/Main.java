
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int x = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int y = scanner.nextInt();
        int k = x + y;
        System.out.printf("Ответ: %d\n", k);


        System.out.print("Введите число: ");
        int n = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int m = scanner.nextInt();
        int s = n * m;
        System.out.printf("Ответ: %d\n", s);;

        System.out.print("Введите число: ");
        int l = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int q = scanner.nextInt();
        int j = l - q;
        System.out.printf("Ответ: %d\n", j);;

        System.out.print("Введите число: ");
        int o = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int p = scanner.nextInt();
        int h = o / p;
        System.out.printf("Ответ: %d\n", h);;

        scanner.close();
    }


}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите 3 числа: ");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        boolean hasValuesDivisibleBy5 = false;
        if (a % 5 == 0) {
            System.out.println("a=" + a);
            hasValuesDivisibleBy5 = true;
        }
        if (b % 5 == 0) {
            System.out.println("b=" + b);
            hasValuesDivisibleBy5 = true;
        }
        if (c % 5 == 0) {
            System.out.println("c=" + c);
            hasValuesDivisibleBy5 = true;
        }
        if (!hasValuesDivisibleBy5) {
            System.out.println("нет значений, кратных 5");
        }

        int d = a / b;
        System.out.println(d);

        double e = (double) a / b;
        System.out.println(e);

        int f = (int) Math.ceil(e);
        System.out.println(f);

        int g = (int) Math.floor(e);
        System.out.println(g);

        int h = (int) Math.round(e);
        System.out.println(h);

        int i = b % c;
        System.out.println(i);

        int min = Math.min(a, b);
        System.out.println(min);

        int max = Math.max(b, c);
        System.out.println(max);
    }
}
import java.util.Scanner;
public class Main {
    public static double task1(int n) {
        double sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += 1.0 / Math.sqrt(i);
        }
        return sum;
    }

    public static double task2(double x, int n) {
        double sum = 0;
        double power = x;
        int sign = 1;

        for (int i = 1; i <= n; i++) {
            sum += sign * power / i;
            power *= x;
            sign = -sign;
        }
        return sum;
    }

    public static boolean task3(int n) {
        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 != 0) {
                return true;
            }
            n /= 10;
        }
        return false;
    }

    public static double task4(double x1, double y1, double z1, double x2, double y2, double z2) {
        double dx = x2 - x1;
        double dy = y2 - y1;
        double dz = z2 - z1;

        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("номер задания");

        int task = scanner.nextInt();

        switch (task) {
            case 1: {
                System.out.println("введите n");
                int n = scanner.nextInt();

                System.out.println("ответ: " + task1(n));
                break;
            }

            case 2: {
                System.out.println("введите x");
                double x = scanner.nextDouble();

                System.out.println("введите n");
                int n = scanner.nextInt();

                System.out.println("ответ: " + task2(x, n));
            }

            case 3: {
                System.out.println("введите n");
                int n = scanner.nextInt();

                System.out.println("ответ: " + task3(n));
            }

            case 4: {
                System.out.println("введите x1, y1, z1, x2, y2, z2");
                double x1 = scanner.nextDouble();
                double y1 = scanner.nextDouble();
                double z1 = scanner.nextDouble();
                double x2 = scanner.nextDouble();
                double y2 = scanner.nextDouble();
                double z2 = scanner.nextDouble();

                System.out.println("ответ: " + task4(x1, y1, z1, x2, y2, z2));
            }
        }
        scanner.close();
    }
}
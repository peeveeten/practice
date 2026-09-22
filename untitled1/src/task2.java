import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("вычисление функции");
        System.out.print("введите х: ");

        double x = scanner.nextDouble();

        double y = Math.pow(Math.sin(x), 2) - Math.cos(2 * x) + Math.tan(x);

        System.out.println("значение функции у = " + y);

        scanner.close();
    }
}
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("введите первое число: ");
        double num1 = scanner.nextDouble();

        System.out.print("введите второе число: ");
        double num2 = scanner.nextDouble();

        if (num1 > num2) {
            System.out.println("Большее число: " + num1);
            System.out.println("Меньшее число: " + num2);
        } else if (num2 > num1) {
            System.out.println("Большее число: " + num2);
            System.out.println("Меньшее число: " + num1);
        } else {
            System.out.println("Числа равны: " + num1);
        }

        scanner.close();
    }
}

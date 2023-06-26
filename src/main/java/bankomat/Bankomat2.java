package bankomat;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bankomat2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму для снятия с банкомата");
        int amount = 0;
        try {
            amount = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Вы ввели не число");
            System.exit(1);
        }
        
        int [] array = {5000, 2000, 1000, 500, 200, 100, 50, 10, 5, 2, 1};

        for (int banknote: array) {
            System.out.println(amount / banknote  + " купюр(ы)/монет(ы) по " + banknote + " рублей");
            amount = amount % banknote;
        }
    }
}

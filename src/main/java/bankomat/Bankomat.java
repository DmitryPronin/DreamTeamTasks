package bankomat;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bankomat {

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

        int banknote5000 = amount / 5000;
        amount = amount % 5000;
        int banknote2000 = amount / 2000;
        amount = amount % 2000;
        int banknote1000 = amount / 1000;
        amount = amount % 1000;
        int banknote500 = amount / 500;
        amount = amount % 500;
        int banknote200 = amount / 200;
        amount = amount % 200;
        int banknote100 = amount / 100;
        amount = amount % 100;
        int banknote50 = amount / 50;
        amount = amount % 50;
        int banknote10 = amount / 10;
        amount = amount % 10;
        int banknote5 = amount / 5;
        amount = amount % 5;
        int banknote2 = amount / 2;
        amount = amount % 2;

        System.out.println(banknote5000 + " купюр(ы) по 5000 рублей");
        System.out.println(banknote2000 + " купюр(ы) по 2000 рублей");
        System.out.println(banknote1000 + " купюр(ы) по 1000 рублей");
        System.out.println(banknote500 + " купюр(ы) по 500 рублей");
        System.out.println(banknote200 + " купюр(ы) по 200 рублей");
        System.out.println(banknote100 + " купюр(ы) по 100 рублей");
        System.out.println(banknote50 + " купюр(ы) по 50 рублей");
        System.out.println(banknote10 + " монет(ы) по 10 рублей");
        System.out.println(banknote5 + " монет(ы) по 5 рублей");
        System.out.println(banknote2 + " монет(ы) по 2 рублей");
        System.out.println(amount + " монет(ы) по 1 рублей");
    }
}

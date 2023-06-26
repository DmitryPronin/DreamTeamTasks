package randommisseddigit;

import java.util.HashSet;
import java.util.Random;

public class RandomMissedDigit {
    public static void main(String[] args) {
        Random random = new Random();
        HashSet<Integer> integers = new HashSet<>();

        while (integers.size() < 1000) {
            int randomInt = random.nextInt(1000) + 1;
            System.out.println("\"" + randomInt + "\"");
            integers.add(randomInt);
        }

        for (int i = 1; i <= 1000; i++) {
            if (!integers.contains(i)) {
                System.out.println("Пропущено число " + i);
                System.exit(0);
            }
        }
    }
}

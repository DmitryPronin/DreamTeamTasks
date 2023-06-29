package randommisseddigit;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Random;

public class RandomMissedDigit {
    public static void main(String[] args) {
        LocalDateTime start = LocalDateTime.now();
        Random random = new Random();
        HashSet<Integer> integers = new HashSet<>();

        while (integers.size() < 999) {
            int randomInt = random.nextInt(1000) + 1;
//            System.out.println("\"" + randomInt + "\"");
            integers.add(randomInt);
        }

        for (int i = 1; i <= 1000; i++) {
            if (!integers.contains(i)) {
                System.out.println("Пропущено число " + i);
                break;

            }
        }

        LocalDateTime end = LocalDateTime.now();

        Duration duration = Duration.between(start, end);

        System.out.println(duration.toNanos());
    }
}

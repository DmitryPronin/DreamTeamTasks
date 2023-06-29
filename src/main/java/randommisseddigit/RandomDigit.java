package randommisseddigit;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class RandomDigit {
    public static void main(String[] args) {
        LocalDateTime start = LocalDateTime.now();
        System.out.println(LocalDateTime.now());
        int randomNumber = new Random().nextInt(1000) + 1;
        System.out.println(randomNumber);
        int[] array = IntStream.range(1, 1001).filter(n -> n != randomNumber).toArray();
        int[] array2 = IntStream.range(1, 1001).toArray();

        int i = Arrays.stream(array2).sum() - Arrays.stream(array).sum();
        System.out.println(i);
        LocalDateTime end = LocalDateTime.now();
        System.out.println(LocalDateTime.now());

        Duration duration = Duration.between(start, end);

        System.out.println(duration.toNanos());
    }
}

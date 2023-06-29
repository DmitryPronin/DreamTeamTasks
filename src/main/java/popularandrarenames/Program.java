package popularandrarenames;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Stream;

public class Program {
    public static void main(String[] args) {
        String pathToFile = "src/main/resources/names.txt";
        HashMap<String, Integer> namesAndCount = readDataFromFileToGashMap(pathToFile);
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("_______MENU_______");
            System.out.println("1 - Вывести все данные по именам");
            System.out.println("2 - Вывести самое популярное имя");
            System.out.println("3 - Вывести самое редкое имя");
            System.out.println("0 - Выход");
            System.out.print("Введите значение из меню: ");
            String answer = scanner.next();
            switch (answer){
                case "1" -> showAllData(namesAndCount);
                case "2" -> showPopularNames(namesAndCount);
                case "3" -> showRareNames(namesAndCount);
                case "0" -> System.exit(0);
                default -> System.out.println("\n Такого пункта нет в меню");
            }
            System.out.println(" ");
        }
    }

    private static void showRareNames(HashMap<String, Integer> namesAndCount) {
        Optional<Map.Entry<String, Integer>> min = namesAndCount.entrySet().stream()
                .min(Map.Entry.comparingByValue());
        System.out.println(min);
    }

    private static void showPopularNames(HashMap<String, Integer> namesAndCount) {
        Optional<Map.Entry<String, Integer>> max = namesAndCount.entrySet().stream()
                .max(Map.Entry.comparingByValue());
        System.out.println("Имя " + max.get().getKey() + " встречается " + max.get().getValue() + " раз");
    }

    private static void showAllData(HashMap<String, Integer> namesAndCount) {
        namesAndCount.forEach((s, integer) -> System.out.println("Имя " + s + " встречается " + integer + " раз"));
    }

    private static HashMap<String, Integer> readDataFromFileToGashMap(String pathToFile) {
        Stream<String> lines;
        try {
            lines = Files.lines((Paths.get(pathToFile)));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        HashMap<String, Integer> namesAndCountTemp = new HashMap<>();

        lines.forEach(s -> {
            String[] arr = s.split(",");
            String name = arr[0];
            namesAndCountTemp.compute(name, (key, value) -> (value == null) ? 1 : value + 1);
        });

        return namesAndCountTemp;
    }


}


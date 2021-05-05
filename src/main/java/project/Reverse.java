package project;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Reverse {
    static List<String> inputWord = null;
    static List<String> inputWordBeforeReverse = null;
    static List<String> stringList = null;
    static String outputArray = null;


    public static String reverseFibonacci(List<Integer> array, int inputNumbers) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        convertText(stringList);
        for (int i = 1; array.size() > i; i++){
            stringBuilder.append(array.get(i)).append(" ")
                    .append(stringList.get(i)).append("\n");
        }
        outputArray = stringBuilder.toString();
        return stringBuilder.toString();
    }

    static List<String> convertText(List<String> string) throws IOException {
        List<String> inputWord = Files.lines(Paths.get("source.txt")).collect(Collectors.toList());
        inputWord = inputWord.stream()
                .map(s -> s.replaceAll("[^a-z]+", ""))
                .collect(Collectors.toList());
        inputWordBeforeReverse = inputWord;

        inputWord = inputWord.stream()
                .map(s -> new StringBuilder(s)
                .reverse()
                .toString())
                 .collect(Collectors.toList());
        stringList = new ArrayList<>(inputWord.size());

        for (String part : inputWord) {
            stringList.add(part);
        }
        return stringList;

    }

    static String countFibonacci(List<Integer> array, int count) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; array.size() > i; i++){
            stringBuilder.append(inputWordBeforeReverse.get(i)).append(" ")
                    .append(array.get(i)).append("\n");
        }
        System.out.println(new StringBuilder().append("First step:").append("\n").append(stringBuilder.toString()));
        return stringBuilder.toString();
    }
}

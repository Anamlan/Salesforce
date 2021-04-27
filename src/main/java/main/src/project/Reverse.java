package project;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Reverse {
    private static final Logger logger = LogManager.getRootLogger();
    static List<String> inputWord = null;
    static List<String> stringList = null;
    static String outputArray = null;

    public static String reverseFibonacci(List<Integer> array, int inputNumbers) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        convertText(stringList);
        for (int i = (array.size() - 1); i > 0; i--){
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
        inputWord = inputWord.stream()
                .map(s -> new StringBuilder(s)
                .reverse()
                .toString())
                 .collect(Collectors.toList());
        stringList = new ArrayList<String>(inputWord.size());

        for (String part : inputWord) {
            stringList.add(part);
        }
        return stringList;
    }
}

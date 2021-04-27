package project;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Reverse {
    private static final Logger logger = LogManager.getRootLogger();
    static List<String> inputWord = null;
    static ArrayList<String> stringList = null;
    static String outputArray = null;

    public static String reverseFibonacci(ArrayList<Integer> array, int inputNumbers) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        convertText(stringList);
        for (int i = (array.size() - 1); i > 0; i--){
            stringBuilder.append(array.get(i)).append(" ").append(stringList.get(i)).append("\n");
        }
        outputArray = stringBuilder.toString();
        return stringBuilder.toString();
    }

    static List<String> convertText(List<String> string) throws IOException {
        List<String> inputWord = Files.lines(Paths.get("source.txt")).collect(Collectors.toList());
        inputWord = inputWord.stream()
                .map(s -> s.replaceAll("[^a-z]+", ""))
                .collect(Collectors.toList());

        stringList = new ArrayList<String>(inputWord.size());

        for (String part : inputWord) {
            stringList.add(part);
        }
    //    System.out.println(reverse(stringList));
     //   System.out.println(reverseStringByWords(stringList));
        return stringList;
    }
    @SuppressWarnings("unchecked")
    static <T> Stream<T> reverse(ArrayList<String> input) {
        Object[] temp = input.toArray();
        return (Stream<T>) IntStream.range(0, temp.length)
                .mapToObj(i -> temp[temp.length - i - 1]);
    }

    static List<String> reverseStringByWords(ArrayList<String> string) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int j = stringList.size()-1; j >= 0; j--) {
            stringBuilder.append(stringList.get(j)).append(' ');
        }
        for (Object part : stringList) {
            stringBuilder.reverse().toString();
        }
        return Arrays.asList(stringBuilder.toString());
    }

}

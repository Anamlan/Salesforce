package project;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

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
        stringList = stringList.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(stringList);
        return stringList;
    }

    static List<String> reverseStringByWords(List<String> stringList) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int j = stringList.size()-1; j >= 0; j--) {
            stringBuilder.append(stringList.get(j)).append(' ').append("\n");
        }
        for (Object part : stringList) {
            stringBuilder.reverse().toString();
        }
        return Arrays.asList(stringBuilder.toString());
    }
    public static <T> Stream<T> getReverseStream(List<T> list) {
        final ListIterator<T> listIt = list.listIterator(list.size());
        final Iterator<T> reverseIterator = new Iterator<T>() {
            @Override
            public boolean hasNext() {
                return listIt.hasPrevious();
            }

            @Override
            public T next() {
                return listIt.previous();
            }
        };
        return StreamSupport.stream(Spliterators.spliteratorUnknownSize(
                reverseIterator,
                Spliterator.ORDERED | Spliterator.IMMUTABLE), false);
    }
}

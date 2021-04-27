package project;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static project.Numbers.countFib;

public class Reverse {
    private static final Logger logger = LogManager.getRootLogger();
    static List<String> stringList = null;
    static String outputArray = "";

    public static ArrayList reverseFibonacci(ArrayList<Integer> array, int inputNumbers) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = (countFib - 1); i > 0; i--){
        stringBuilder.append(array.get(i)).append(" ").append(convertText(String.valueOf(stringList))).append("\n");
        }
        outputArray = stringBuilder.toString();
        Collections.reverse(array);
        return array;
    }

    static List<String> convertText(String string) throws IOException {
        List<String> lart = Files.lines(Paths.get("source.txt")).collect(Collectors.toList());
        List<String> avss = new ArrayList<>();
        lart = lart.stream().map(s -> s.replaceAll("[^a-z]+", ""))
                .collect(Collectors.toList());

        stringList = new ArrayList<String>(lart.size()) ;
        for (String myString : lart){
            stringList.add((myString));
        }
        return stringList;
    }
}

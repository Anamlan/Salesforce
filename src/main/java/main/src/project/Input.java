package project;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Input {
    private static final Logger logger = LogManager.getRootLogger();
    public static final Path INPUT = Paths.get("source.txt");
    static int count = 0;
    static List<Integer> newList = null;

    public static int countInt() throws IOException {
        List<String> inputFromFile = Files.lines(Paths.get("source.txt")).collect(Collectors.toList());
        inputFromFile = inputFromFile.stream().map(s -> s.replaceAll("\\D+", ""))
                .collect(Collectors.toList());

        newList = new ArrayList<Integer>(inputFromFile.size()) ;
        for (String myInt : inputFromFile){
            newList.add(Integer.valueOf(myInt));
        }
        return count;
    }
}

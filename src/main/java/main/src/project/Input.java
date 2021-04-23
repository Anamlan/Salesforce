package project;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Input {
    private static final Logger logger = LogManager.getRootLogger();
    public static final Path INPUT = Paths.get("source.txt");
    static int numberOfInteger = 7;

    public static Integer countInt(int number) {
        int[] result = null;
        int numberOfInteger = 0;
        Reader read = null;
        try {
            read = new FileReader(String.valueOf(INPUT));
        } catch (FileNotFoundException e) {
            logger.info("input file" + e);
        }
        int count = 0;
        Scanner scan = new Scanner(read);
        while (scan.hasNextLine()) {
            scan.skip("[^0-9]+");
            numberOfInteger = Integer.parseInt(scan.next());
            result[numberOfInteger] = numberOfInteger;
            count++;
        }
        return count;
    }
}

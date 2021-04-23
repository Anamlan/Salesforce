package project;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.Scanner;

public class Input {
    private static final Logger logger = LogManager.getRootLogger();
    public static String INPUT = "source.txt";
    public static int numberOfInteger = 7;

    public static Integer count(int numberOfInteger) {
        int[] result = new int[10];
        Reader read = null;
        try {
            read = new FileReader(INPUT);
        } catch (FileNotFoundException e) {
            logger.info("input file" + e);
        }
        Scanner scan = new Scanner(read);
        while (scan.hasNextLine()) {
            scan.skip("[^0-9]+");
            numberOfInteger = Integer.parseInt(scan.next());
            result[numberOfInteger] = numberOfInteger;
        }
        return numberOfInteger;
    }
}

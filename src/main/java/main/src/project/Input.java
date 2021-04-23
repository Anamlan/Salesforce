package project;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Input {
    private static final Logger logger = LogManager.getRootLogger();
    public static final Path INPUT = Paths.get("source.txt");
    static int numberOfInteger = 7;

    public static Integer countInt(int number) {
        String numberOfElements = null;
        int inputNumbers = 0;
        Reader reader = null;
        try {
            reader = new FileReader(String.valueOf(INPUT));
            inputNumbers = Integer.parseInt(String.valueOf(reader.read()));
        } catch (FileNotFoundException e) {
            logger.info("input file" + e);
        } catch (IOException e) {
            logger.error("error message: " + e.getMessage());
        }
        int count = 0;
        Scanner scan = new Scanner(reader);
        while (scan.hasNextLine()) {
            scan.skip("[^0-9]+");
            numberOfElements = scan.nextLine();
            count++;
        }
        return count;
    }
}

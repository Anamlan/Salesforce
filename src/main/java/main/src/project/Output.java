package project;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Output {
    private static final Logger logger = LogManager.getRootLogger();
    public static final Path OUTPUT = Paths.get("output.txt");

    public static void main(String args) {
        try (FileWriter writeTo = new FileWriter(String.valueOf(OUTPUT))){
            Scanner scan = new Scanner(CheckArray.convertText(String.valueOf(Input.INPUT)));
            String next = "";
            for (int i = 0; i < next.length(); i++){
                next = scan.nextLine();
            }
            writeTo.write(CheckArray.convertText(next));
        } catch (IOException io) {
            logger.info("output file" + io);
        } catch (Exception ex) {
            logger.error("error message: " + ex.getMessage());
            logger.fatal("fatal error message: " + ex.getMessage());

        }
        System.out.println(new StringBuilder().append("output ==> ").append(System.lineSeparator()).
                append(CheckArray.getInput(String.valueOf(OUTPUT))).toString());
    }
}

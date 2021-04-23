package project;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Output {
    private static final Logger logger = LogManager.getRootLogger();
    public static final Path OUTPUT = Paths.get("output.txt");

    public static void main(String[] args) throws IOException {
        Reader read = new FileReader(String.valueOf(Input.INPUT));
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<String> data = new ArrayList<>();
        try (FileWriter writeTo = new FileWriter(String.valueOf(OUTPUT))){
            Scanner scan = new Scanner(CheckArray.convertText(String.valueOf(Input.INPUT)));
            String next = new String();
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

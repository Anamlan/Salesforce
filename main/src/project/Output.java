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
        Reader read = new FileReader(Input.INPUT);
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<String> data = new ArrayList<>();
        try (FileWriter writeTo = new FileWriter(String.valueOf(OUTPUT))){
            Scanner scan = new Scanner(CheckArray.convertText(Input.INPUT));
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
            toFile(data, String.valueOf(OUTPUT));
        }
        System.out.println(new StringBuilder().append("output ==> ").append(System.lineSeparator()).
                append(CheckArray.getInput(String.valueOf(OUTPUT))).toString());
    }

    public static void toFile(ArrayList<String> data, String fileName) {
        fileName = fileName.length() == 0 ? "output.txt" : fileName;
        logger.info("Result to " + fileName);
        try (Writer writeTo = new FileWriter(fileName, false)) {
            for (int i = 0; i < data.size(); i++) {
                writeTo.write(data.get(i));
            }
        } catch (IOException ex) {
            logger.error("error message: " + ex.getMessage());
            logger.fatal("fatal error message: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}

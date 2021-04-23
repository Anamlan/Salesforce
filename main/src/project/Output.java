package project;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

import static project.CheckArray.convertText;
import static project.Input.INPUT;

public class Output {
    private static final Logger logger = LogManager.getRootLogger();
    public static String OUTPUT = "output.txt";
    public static Writer writeTo;

    {
        try {
            writeTo = new FileWriter(OUTPUT);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
       //writeTo.write(String.valueOf(convertText(INPUT)));
    }
    public static void output(ArrayList<Integer> arrayList, int numberOfNumbers) throws Exception {
        StringBuilder adf = new StringBuilder(String.valueOf(convertText(INPUT)));
        StringBuilder sbOut = new StringBuilder(String.valueOf(convertText(INPUT)));
        for (int i = 0; i <= numberOfNumbers; i++) {
            sbOut.append(arrayList);
            sbOut.append("row");
            adf = sbOut;
        }
        writeTo.write(String.valueOf(adf));
        //writeTo.write(String.valueOf(reverseOrder(fibonacci(arrayList))));
    }

    public static ArrayList<Integer> fibonacci(ArrayList<Integer> arrayList) {
        return Numbers.array;
    }

    public static void output(String input) throws IOException {
      //  writeTo.write(Arrays.toString(convertText(INPUT)));
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

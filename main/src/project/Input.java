package project;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.MatchResult;

public class Input {

    private static final Logger logger = LogManager.getRootLogger();
    public static String INPUT = "source.txt";
    int numberOfNumbers = 0;
    private final ArrayList<String> arrayList = new ArrayList<>();

    public Input(String input) {
    }

    public String Input(String input) throws FileNotFoundException {
        int[] result = new int[47];
        Reader read = new FileReader(INPUT);
        Scanner scan = new Scanner(read);
        while (scan.hasNextLine()) {
            scan.skip("[^0-9]+");
            numberOfNumbers = Integer.parseInt(scan.next());
            result[numberOfNumbers] = numberOfNumbers;
        }

        String text = new String();
        //Pattern p = Pattern.compile("");
        while (scan.hasNextLine()) {
            scan.skip("[a-zA-Z]+");
            text = scan.nextLine();
            MatchResult match = scan.match();
            String ip = match.group(1);
            String date = match.group(2);
        }return text;
    }

    public ArrayList<String> getArrayList() {
        return arrayList;
    }

}

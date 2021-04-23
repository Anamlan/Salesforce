package project;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reverse {
    private static final Logger logger = LogManager.getRootLogger();

    static String outputArray = new String();
    static Reader read;
    {
        try {
            read = new FileReader(String.valueOf(Input.INPUT));
        } catch (FileNotFoundException e) {
            logger.error("error message: " + e.getMessage());
        }
    }

    public static ArrayList reverseFibonacci(ArrayList<Integer> array, int countFib) throws Exception {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = (countFib - 1); i > 0; i--){
        stringBuilder.append(array.get(i)).append(" ").append("wor").append("\n");
        }
        outputArray = stringBuilder.toString();
        Collections.reverse(array);
        return array;
    }

    static String convertText(String string) throws Exception {
        StringBuilder sb = new StringBuilder();
        String input = String.valueOf(read);
        Pattern pattern = Pattern.compile("([a-zA-Z])");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()){
                sb.append(matcher.group().charAt(0));
        }
        return sb.toString();
    }
}

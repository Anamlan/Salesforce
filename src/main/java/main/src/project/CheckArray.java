package project;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Logger;

public interface CheckArray {
    static String convertText(String input) throws Exception {
        String text;
        StringBuilder sb = new StringBuilder();
        text = Reverse.outputArray;
        return text;
    }

    static String getInput(String fileName) {
        StringBuilder sb = new StringBuilder();
        try {
            Scanner scanner = new Scanner(new File(fileName), "cp1251");
            while (scanner.hasNextLine()) {
                sb.append(scanner.nextLine()).append(System.lineSeparator());
            }
            scanner.close();
            return sb.toString().trim();
        } catch (IOException ex) {
            Logger.getLogger("Exception : " + ex);
        }
        return sb.toString();
    }
}

package project;

import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Scanner;

import static project.Input.INPUT;

public interface CheckArray {

    public static void main(String[] args) throws Exception {
        System.out.println(String.valueOf(convertText(INPUT)));
    }
    static String convertText(String input) throws Exception {
        String text = null;
        Reader read = new FileReader("source.txt");
        ArrayList scan = Numbers.array;
        Scanner scan1 = new Scanner(read);
        StringBuilder sb = new StringBuilder();
        while (scan1.hasNextLine()) {
            scan1.skip("([a-zA-Z])");
            text = scan1.nextLine();
            sb.append(text).append(scan).append(System.lineSeparator());
        }return sb.toString();

    }
}

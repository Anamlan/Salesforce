package project;

import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static project.Input.INPUT;

public class Numbers {

    public static ArrayList<Integer> array = new ArrayList<>(1);

    public static void main(String[] args) throws Exception {
        Reader reader = new FileReader(INPUT);
        int numberOfNumbers = Integer.parseInt(String.valueOf(reader.read()));

        reverseOrder(String.valueOf(join(array)));
    }
    public static ArrayList<Integer> fibonacci(int a, int b, int numberOfNumbers) throws Exception {
        int sum;
        for (int i = 0; i < numberOfNumbers; i++) {
            array.add(a);
            sum = a + b;
            a = b;
            b = sum;
        }
        return array;
    }
    public static List<?> join(ArrayList<Integer> array) throws Exception {
        StringBuilder sbd = new StringBuilder();
        for (int i = 0 ; i < array.size(); i++){
            sbd.append(array).append("row").append(System.lineSeparator());
        }
        return Collections.singletonList(sbd);
    }


    public static String reverseOrder(String input) throws Exception {
        Collections.reverse(join(array));
        System.out.println("Reversed order: " + input);
        return String.valueOf(input);
     }

}


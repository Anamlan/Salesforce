package project;

import java.util.ArrayList;

public class Numbers {

    static ArrayList<Integer> array = new ArrayList<>();
    static int countFib;

    public static ArrayList<Integer> fibonacci(int inputNumbers) throws Exception {
        int sum;
        int firstElement = 1;
        int secondElement = 1;
        array = new ArrayList<>();
        for (int i = 0; i < Input.numberOfInteger; i++) {
            array.add(firstElement);
            sum = firstElement + secondElement;
            firstElement = secondElement;
            secondElement = sum;
            countFib++;
        }
        return array;
    }
}



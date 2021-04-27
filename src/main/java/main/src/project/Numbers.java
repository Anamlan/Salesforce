package project;

import java.util.ArrayList;
import java.util.List;

import static project.Input.newList;

public class Numbers {

    static List<Integer> array = new ArrayList<>();
    static int countFib;

    public static List<Integer> fibonacci(int inputNumbers) {
        int sum = 1;
        int firstElement = 0;
        int secondElement = 1;
        array = new ArrayList<>();
        while (sum <= newList.size()){
            array.add(sum);
            sum = firstElement + secondElement;
            firstElement = secondElement;
            secondElement = sum;
        }
        countFib = array.size();
        return array;
    }
}



package project;

import java.util.ArrayList;

import static project.Input.newList;

public class Numbers {

    static ArrayList<Integer> array = new ArrayList<>();
    static int countFib;

    public static ArrayList<Integer> fibonacci(int inputNumbers) {
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



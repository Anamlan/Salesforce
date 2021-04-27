package project;

import java.util.ArrayList;

import static project.Input.newList;

public class Numbers {

    static ArrayList<Integer> array = new ArrayList<>();
    static int countFib;

    public static ArrayList<Integer> fibonacci(int inputNumbers) {
        int sum;
        int firstElement = 1;
        int secondElement = 1;
        array = new ArrayList<>();

        for (int i = 0; i < newList.size(); i++) {
            array.add(firstElement);
            sum = firstElement + secondElement;
            firstElement = secondElement;
            secondElement = sum;
        }
        countFib = array.size();
        return array;
    }
//    public static ArrayList<Integer> fibonacci(int inputNumbers) {
//        int sum;
//        int firstElement = 1;
//        int secondElement = 1;
//        array = new ArrayList<>();
//        for (int i = 0; i < Input.count; i++) {
//            array.add(firstElement);
//            sum = firstElement + secondElement;
//            firstElement = secondElement;
//            secondElement = sum;
//        }
//        countFib = array.size();
//        return array;
//    }
}



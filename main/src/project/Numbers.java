package project;

import java.util.ArrayList;

public class Numbers {
    static int numberOfInteger = Input.numberOfInteger;

    public static ArrayList<Integer> fibonacci(int numberOfNumbers) throws Exception {
        int sum;
        int firstElement = 1;
        int secondElement = 1;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < numberOfNumbers; i++) {
            arrayList.add(firstElement);
            sum = firstElement + secondElement;
            firstElement = secondElement;
            secondElement = sum;
        }
        return arrayList;
    }
}



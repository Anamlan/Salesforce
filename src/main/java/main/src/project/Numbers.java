package project;

import java.util.ArrayList;

public class Numbers {

    public static ArrayList<Integer> fibonacci(int numberOfInteger) throws Exception {
        int sum;
        int firstElement = 1;
        int secondElement = 1;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < Input.numberOfInteger; i++) {
            arrayList.add(firstElement);
            sum = firstElement + secondElement;
            firstElement = secondElement;
            secondElement = sum;
        }
        return arrayList;
    }
}



package project;

import java.util.ArrayList;

public class Reverse {
    static String outputArray = new String();

    public static ArrayList reverseFibonacci(ArrayList<Integer> arrayList, int numberOfInteger){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = (arrayList.size() - 1); i > 0; i--){
        stringBuilder.append(arrayList.get(i)).append(" ").append("wor").append("\n");
        }
        outputArray = stringBuilder.toString();
        return arrayList;
    }
}

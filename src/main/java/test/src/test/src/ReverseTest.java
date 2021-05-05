package test.src;

import org.junit.Test;
import project.Reverse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class ReverseTest {
    @Test
    public void fibonacciReversed() throws Exception {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55);
        assertEquals(Arrays.asList(55, 34, 21, 13, 8, 5, 3, 2, 1, 1), Reverse.reverseFibonacci(arrayList, 10));
    }

    @Test
    public void fibonacciReversedNotEquals() throws Exception {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55);
        assertNotEquals(Arrays.asList(1, 1, 2, 3, 5, 8, 13, 21, 34, 55), Reverse.reverseFibonacci(arrayList, 10));
    }
}
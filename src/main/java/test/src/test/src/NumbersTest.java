package test.src;

import org.junit.Test;
import project.Numbers;

import java.io.PrintStream;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class NumbersTest {
    PrintStream old = System.out;

    @Test
    public void fibonacciDirect() throws Exception {
        assertEquals(Arrays.asList(1, 1, 2, 3, 5, 8, 13), Numbers.fibonacci(10));
    }
}
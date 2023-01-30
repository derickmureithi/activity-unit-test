package org.example;
import java.util.Arrays;
public class Calculator {
    public int add(int a, int b) {
        //System.out.println("*");
        return a + b;
    }

    public int add(int a, int... b) {
        //System.out.println("**");
        return a + Arrays.stream(b).sum();
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }
}


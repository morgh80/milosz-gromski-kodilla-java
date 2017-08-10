package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        //Calculator add function test
        Double addResult = calculator.add(1.0, 2.0);
        if (addResult.equals(3.0)) {
            System.out.println("Add test OK");
        } else {
            System.out.println("Add test failed");
        }

        //Calculator subtract function test
        Double subtractResult = calculator.subtract(2.0, 1.0);
        if (subtractResult.equals(1.0)) {
            System.out.println("Subtract test OK");
        } else {
            System.out.println("Subtract test failed");
        }

    }
}
package org.example;

public class TestingMain {
    public static void main(String[] args) {
        Example example = new Example("Wojtek");

        String finalResult = example.getExample();

        if (finalResult.equals("kuba")) {
            System.out.println("Test passed");
        } else {
            System.out.println("Error");
        }

    }

}

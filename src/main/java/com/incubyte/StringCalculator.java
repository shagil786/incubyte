package com.incubyte;

public class StringCalculator {
    public int add(String numbers) {
        if(numbers.isEmpty()) {
            return 0;
        }

        String delimiter = ",";
        if(numbers.startsWith("//")) {
            int delimiterIndex = numbers.indexOf("\n");
            delimiter = numbers.substring(2, delimiterIndex);
            numbers = numbers.substring(delimiterIndex + 1);
        }
        
        numbers = numbers.replace("\n", delimiter);
        String[] parts = numbers.split(delimiter);
        int sum = 0;
        for(String part : parts) {
            sum += Integer.parseInt(part);
        }

        return sum;
    }
}

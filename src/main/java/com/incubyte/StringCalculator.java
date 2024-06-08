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
        StringBuilder negatives = new StringBuilder();
        for(String part : parts) {
            int number = Integer.parseInt(part);
            if(number < 0) {
                if(negatives.length() > 0) {
                    negatives.append(",");
                }
                negatives.append(number);
            }
            sum += number;
        }

        if(negatives.length() > 0) {
            throw new IllegalArgumentException("negative numbers not allowed: " + negatives);
        }

        return sum;
    }
}

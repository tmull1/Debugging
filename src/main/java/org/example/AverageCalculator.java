package org.example;

public class AverageCalculator {

    public static double calculateAverage(int[] numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return (double) sum / numbers.length;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        double average = calculateAverage(numbers);
        System.out.println("Average: " + average);

        // Introducing NullPointerException
        int[] nullNumbers = null;
        try {
            calculateAverage(nullNumbers);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }

        // Introducing ArrayIndexOutOfBoundsException
        try {
            int sum = 0;
            for (int i = 0; i <= numbers.length; i++) {
                sum += numbers[i];
            }
            double wrongAverage = (double) sum / numbers.length;
            System.out.println("Wrong Average: " + wrongAverage);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught exception: " + e);
        }

        // Introducing logic error
        System.out.println("Average with logic error: " + calculateAverageWithLogicError(numbers));
    }

    // Method to introduce a logic error
    public static double calculateAverageWithLogicError(int[] numbers) {
        if (numbers == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return (double) (sum + 1) / numbers.length;
    }
}


package cn.xpbootcamp.fizzbuzz;

import java.util.Arrays;
import java.util.List;

public class FizzBuzz {
    private final int number;

    public FizzBuzz(int number) {
        this.number = number;
    }

    public String reply() {
        if (isContains(3)) {
            return "Fizz";
        }

        if (isContains(7) && isDivisibleByNumbers(Arrays.asList(3))) {
            return "Fizz";
        }

        if (isContains(7) && isDivisibleByNumbers(Arrays.asList(7))) {
            return "Whizz";
        }

        if (isDivisibleByNumbers(Arrays.asList(7)) && isContains(5)) {
            return "Whizz";
        }

        if (isDivisibleByNumbers(Arrays.asList(3, 5, 7))) {
            return "FizzBuzzWhizz";
        }
        if (isDivisibleByNumbers(Arrays.asList(3, 5))) {
            return "FizzBuzz";
        }
        if (isDivisibleByNumbers(Arrays.asList(3, 7))) {
            return "FizzWhizz";
        }
        if (isDivisibleByNumbers(Arrays.asList(5, 7))) {
            return "BuzzWhizz";
        }
        if (isDivisibleByNumbers(Arrays.asList(3)) && !isContains(5)) {
            return "Fizz";
        }
        if (isDivisibleByNumbers(Arrays.asList(5)) && !isContains(7)) {
            return "Buzz";
        }
        if (isDivisibleByNumbers(Arrays.asList(7))) {
            return "Whizz";
        }
        return String.valueOf(number);
    }

    private boolean isDivisibleByNumbers(List<Integer> numbers) {
        return numbers.stream().map(this::isDivisibleBy).reduce(true, (x, y) -> x && y);
    }

    private boolean isDivisibleBy(int divisor) {
        return number % divisor == 0;
    }

    private boolean isContains(int literalNumber) {
        return String.valueOf(number).contains(String.valueOf(literalNumber));
    }
}

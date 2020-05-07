package cn.xpbootcamp.fizzbuzz;

public class FizzBuzz {
    private final int number;

    public FizzBuzz(int number) {
        this.number = number;
    }

    public String reply() {
        if (isDivisibleBy(3) && isDivisibleBy(5)) {
            return "FizzBuzz";
        }
        if (isDivisibleBy(3) && isDivisibleBy(7)) {
            return "FizzWhizz";
        }
        if (isDivisibleBy(5) && isDivisibleBy(7)) {
            return "BuzzWhizz";
        }
        if (isDivisibleBy(3)) {
            return "Fizz";
        }
        if (isDivisibleBy(5)) {
            return "Buzz";
        }
        if (isDivisibleBy(7)) {
            return "Whizz";
        }
        return String.valueOf(number);
    }

    private boolean isDivisibleBy(int divisor) {
        return number % divisor == 0;
    }
}

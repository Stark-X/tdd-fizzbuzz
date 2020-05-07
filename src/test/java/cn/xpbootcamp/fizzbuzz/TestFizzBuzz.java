package cn.xpbootcamp.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;


public class TestFizzBuzz {
    @Test
    public void should_return_fizz_when_number_is_divisible_by_3() {
        assertThat(new FizzBuzz(3).reply(), equalTo("Fizz"));
    }

    @Test
    public void should_return_buzz_when_number_is_divisible_by_5() {
        assertThat(new FizzBuzz(5).reply(), equalTo("Buzz"));
    }

    @Test
    public void should_return_whizz_when_number_is_divisible_by_7() {
        assertThat(new FizzBuzz(7).reply(), equalTo("Whizz"));
    }

    @Test
    public void should_return_fizzbuzz_when_number_is_divisible_by_3_and_5() {
        assertThat(new FizzBuzz(15).reply(), equalTo("FizzBuzz"));
    }

    @Test
    public void should_return_fizzwhizz_when_number_is_divisible_by_3_and_7() {
        assertThat(new FizzBuzz(21).reply(), equalTo("FizzWhizz"));
    }

    @Test
    public void should_return_buzzwhizz_when_number_is_divisible_by_5_and_7() {
        assertThat(new FizzBuzz(35).reply(), equalTo("BuzzWhizz"));
    }
}

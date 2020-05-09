package cn.xpbootcamp.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;


public class TestFizzBuzz {
    @Test
    public void should_return_fizz_when_number_is_contains_3_and_not_contains_7() {
        assertThat(new FizzBuzz(3).reply(), equalTo("Fizz"));
        assertThat(new FizzBuzz(13).reply(), equalTo("Fizz"));
        assertThat(new FizzBuzz(23).reply(), equalTo("Fizz"));
    }

    @Test
    public void should_return_fizz_when_number_is_divisible_by_3_and_not_contains_3_and_7() {
        assertThat(new FizzBuzz(6).reply(), equalTo("Fizz"));
    }

    @Test
    public void should_return_buzz_when_number_is_divisible_by_5_and_not_divisible_by_7_and_not_contains_3_and_5_and_7() {
        assertThat(new FizzBuzz(5).reply(), equalTo("Buzz"));
        assertThat(new FizzBuzz(10).reply(), equalTo("Buzz"));
    }

    @Test
    public void should_return_whizz_when_number_is_divisible_by_7_and_not_contains_3_and_5_and_7() {
        assertThat(new FizzBuzz(28).reply(), equalTo("Whizz"));
        assertThat(new FizzBuzz(14).reply(), equalTo("Whizz"));
    }

    @Test
    public void should_return_fizzbuzz_when_number_is_divisible_by_3_and_5_and_not_contains_3_and_5_and_7() {
        assertThat(new FizzBuzz(60).reply(), equalTo("FizzBuzz"));
    }

    @Test
    public void should_return_fizzwhizz_when_number_is_divisible_by_3_and_7_and_not_contains_3_and_5_and_7() {
        assertThat(new FizzBuzz(21).reply(), equalTo("FizzWhizz"));
    }

    @Test
    public void should_return_buzzwhizz_when_number_is_divisible_by_5_and_7_and_not_contains_3_and_5_and_7() {
        assertThat(new FizzBuzz(140).reply(), equalTo("BuzzWhizz"));
    }

    @Test
    public void should_return_fizzbuzzwhizz_when_number_is_divisible_by_3_and_5_and_7_and_not_contains_5_and_3_and_7() {
        assertThat(new FizzBuzz(210).reply(), equalTo("FizzBuzzWhizz"));
        assertThat(new FizzBuzz(420).reply(), equalTo("FizzBuzzWhizz"));
    }

    @Test
    public void should_return_whizz_when_number_is_divisible_by_7_and_is_contains_5_and_not_contains_3_and_7() {
        assertThat(new FizzBuzz(56).reply(), equalTo("Whizz"));
        assertThat(new FizzBuzz(105).reply(), equalTo("Whizz"));
    }

    @Test
    public void should_return_number_it_self_when_number_is_not_divisible_by_7_and_is_contains_5_and_3_and_7() {
        assertThat(new FizzBuzz(58).reply(), equalTo("58"));
        assertThat(new FizzBuzz(54).reply(), equalTo("54"));
    }

    @Test
    public void should_return_fizz_when_number_is_contains_7_and_is_divisible_by_3_and_not_contains_3_and_5() {
        assertThat(new FizzBuzz(27).reply(), equalTo("Fizz"));
        assertThat(new FizzBuzz(72).reply(), equalTo("Fizz"));
        assertThat(new FizzBuzz(1470).reply(), equalTo("Fizz"));
    }

    @Test
    public void should_return_whizz_when_number_is_contains_7_and_is_divisible_by_7_and_not_contains_3_and_5() {
        assertThat(new FizzBuzz(7).reply(), equalTo("Whizz"));
        assertThat(new FizzBuzz(77).reply(), equalTo("Whizz"));
        assertThat(new FizzBuzz(70).reply(), equalTo("Whizz"));
    }

    @Test
    public void should_return_fizz_when_number_is_contains_7_and_3_and_not_contains_5() {
        assertThat(new FizzBuzz(37).reply(), equalTo("Fizz"));
        assertThat(new FizzBuzz(73).reply(), equalTo("Fizz"));
        assertThat(new FizzBuzz(173).reply(), equalTo("Fizz"));
    }
}

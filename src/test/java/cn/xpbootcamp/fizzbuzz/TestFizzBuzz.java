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
}

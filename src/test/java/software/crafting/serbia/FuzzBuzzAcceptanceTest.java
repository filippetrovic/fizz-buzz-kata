package software.crafting.serbia;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class FuzzBuzzAcceptanceTest {

  private FizzBuzz fizzBuzz = new FizzBuzz();

  @Test
  public void shouldReturnUnchangedNumberIfItsNotDivisibleBy3or5() {
    assertThat(fizzBuzz.execute(1)).isEqualTo("1");

    assertThat(fizzBuzz.execute(4)).isEqualTo("4");

    assertThat(fizzBuzz.execute(22)).isEqualTo("22");

    assertThat(fizzBuzz.execute(16)).isEqualTo("16");

    assertThat(fizzBuzz.execute(98)).isEqualTo("98");
  }

  @Test
  public void shouldReturnFizzIfNumberIsDivisibleOnlyBy3() {
    assertThat(fizzBuzz.execute(3)).isEqualTo("Fizz");

    assertThat(fizzBuzz.execute(6)).isEqualTo("Fizz");

    assertThat(fizzBuzz.execute(9)).isEqualTo("Fizz");

    assertThat(fizzBuzz.execute(99)).isEqualTo("Fizz");

    assertThat(fizzBuzz.execute(33)).isEqualTo("Fizz");

    assertThat(fizzBuzz.execute(18)).isEqualTo("Fizz");
  }

  @Test
  public void shouldReturnBuzzIfNumberIsDivisibleOnlyBy5() {
    assertThat(fizzBuzz.execute(5)).isEqualTo("Buzz");

    assertThat(fizzBuzz.execute(10)).isEqualTo("Buzz");

    assertThat(fizzBuzz.execute(20)).isEqualTo("Buzz");

    assertThat(fizzBuzz.execute(25)).isEqualTo("Buzz");

    assertThat(fizzBuzz.execute(50)).isEqualTo("Buzz");

    assertThat(fizzBuzz.execute(100)).isEqualTo("Buzz");
  }

  @Test
  public void shouldReturnFizzBuzzIfNumberIsDivisibleByBoth3And5() {
    assertThat(fizzBuzz.execute(15)).isEqualTo("FizzBuzz");

    assertThat(fizzBuzz.execute(30)).isEqualTo("FizzBuzz");

    assertThat(fizzBuzz.execute(45)).isEqualTo("FizzBuzz");

    assertThat(fizzBuzz.execute(90)).isEqualTo("FizzBuzz");
  }
}

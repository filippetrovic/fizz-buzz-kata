package rs.liftoff;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class FizzBuzzUnitTest {

  private FizzBuzz fizzBuzz = new FizzBuzz();

  @Test
  public void shouldNotTransformInput() {
    assertThat(fizzBuzz.transform(1))
        .isEqualTo("1");

    assertThat(fizzBuzz.transform(2))
        .isEqualTo("2");
  }

  @Test
  public void shouldReturnFizz() {
    assertThat(fizzBuzz.transform(3))
        .isEqualTo("Fizz");

    assertThat(fizzBuzz.transform(6))
        .isEqualTo("Fizz");
  }

  @Test
  public void shouldReturnBuzz() {
    assertThat(fizzBuzz.transform(5))
        .isEqualTo("Buzz");

    assertThat(fizzBuzz.transform(10))
        .isEqualTo("Buzz");
  }

  @Test
  public void shouldReturnFizzBuzz() {
    assertThat(fizzBuzz.transform(15))
        .isEqualTo("FizzBuzz");
  }
}

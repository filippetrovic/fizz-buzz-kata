package rs.liftoff;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class FizzBuzzUnitTest {

  private FizzBuzz fizzBuzz = new FizzBuzz();

  @Test
  public void shouldReturn1For1() {
    // given
    final int value = 1;

    // when
    String result = fizzBuzz.transform(value);

    // then
    assertThat(result)
        .isEqualTo("1");
  }

  private class FizzBuzz {

    public String transform(int value) {
      return "1";
    }
  }
}

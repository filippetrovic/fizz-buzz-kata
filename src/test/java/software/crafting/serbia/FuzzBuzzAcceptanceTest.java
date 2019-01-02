package software.crafting.serbia;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class FuzzBuzzAcceptanceTest {

  private FizzBuzz fizzBuzz = new FizzBuzz();

  @Test
  public void shouldReturnUnchangedNumber() {
    assertThat(fizzBuzz.execute(1)).isEqualTo("1");
  }
}

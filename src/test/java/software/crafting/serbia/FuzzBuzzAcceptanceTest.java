package software.crafting.serbia;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class FuzzBuzzAcceptanceTest {

  private FizzBuzz fizzBuzz = new FizzBuzz();

  @Test
  public void shouldReturnUnchangedNumber() {
    assertThat(fizzBuzz.execute(1)).isEqualTo("1");

    assertThat(fizzBuzz.execute(4)).isEqualTo("4");

    assertThat(fizzBuzz.execute(22)).isEqualTo("22");

    assertThat(fizzBuzz.execute(16)).isEqualTo("16");

    assertThat(fizzBuzz.execute(98)).isEqualTo("98");
  }
}

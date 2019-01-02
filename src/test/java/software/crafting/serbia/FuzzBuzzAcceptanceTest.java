package software.crafting.serbia;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class FuzzBuzzAcceptanceTest {

  private FizzBuzz fizzBuzz = new FizzBuzz();

  @Test
  public void shouldReturnUnchangedNumber() {
    // Given

    // When
    String output = fizzBuzz.execute(1);

    // Then
    assertThat(output).isEqualTo("1");

  }
}

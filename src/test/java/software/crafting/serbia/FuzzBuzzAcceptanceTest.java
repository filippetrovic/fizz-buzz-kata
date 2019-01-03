package software.crafting.serbia;

import org.junit.Before;
import org.junit.Test;
import software.crafting.serbia.rule.RuleChains;

import static org.assertj.core.api.Assertions.*;

public class FuzzBuzzAcceptanceTest {

  private FizzBuzz fizzBuzz;

  @Before
  public void setup() {
    fizzBuzz = new FizzBuzz(RuleChains.getOriginalFizzBuzzRuleChain());
  }

  @Test
  public void shouldReturnFizzBuzzIfNumberIsDivisibleByBoth3And5() {
    assertThat(fizzBuzz.execute(15)).isEqualTo("FizzBuzz");

    assertThat(fizzBuzz.execute(30)).isEqualTo("FizzBuzz");

    assertThat(fizzBuzz.execute(45)).isEqualTo("FizzBuzz");

    assertThat(fizzBuzz.execute(90)).isEqualTo("FizzBuzz");
  }
}

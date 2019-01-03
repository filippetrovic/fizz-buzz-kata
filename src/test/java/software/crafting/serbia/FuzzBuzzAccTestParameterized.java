package software.crafting.serbia;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import software.crafting.serbia.rule.RuleChains;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class FuzzBuzzAccTestParameterized {

  @Parameters
  public static Collection<Object[]> data() {
    return Arrays.asList(new Object[][] {
        { 1, "1" }
    });
  }


  private final FizzBuzz fizzBuzz;

  private Integer number;
  private String output;

  public FuzzBuzzAccTestParameterized(Integer number, String output) {
    fizzBuzz = new FizzBuzz(RuleChains.getOriginalFizzBuzzRuleChain());

    this.number = number;
    this.output = output;
  }

  @Test
  public void name() {
    Assertions.assertThat(fizzBuzz.execute(number)).isEqualTo(output);
  }
}

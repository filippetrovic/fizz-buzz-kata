package software.crafting.serbia;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import software.crafting.serbia.rule.RuleChains;

import java.util.Arrays;
import java.util.Collection;

import static org.assertj.core.api.Assertions.*;

@RunWith(Parameterized.class)
public class FuzzBuzzAccTestParameterized {

  @Parameters
  public static Collection<Object[]> data() {
    return Arrays.asList(new Object[][] {
        { 1, "1" },
        { 4, "4" },
        { 22, "22" },
        { 16, "16" },
        { 98, "98" },

        {3, "Fizz"},
        {6, "Fizz"},
        {9, "Fizz"},
        {99, "Fizz"},
        {33, "Fizz"},
        {18, "Fizz"},

        {5, "Buzz"},
        {10, "Buzz"},
        {20, "Buzz"},
        {25, "Buzz"},
        {50, "Buzz"},
        {100, "Buzz"},

        {15, "FizzBuzz"},
        {30, "FizzBuzz"},
        {45, "FizzBuzz"},
        {90, "FizzBuzz"}
    });
  }


  private final FizzBuzz fizzBuzz;

  private Integer number;
  private String expectedOutput;

  public FuzzBuzzAccTestParameterized(Integer number, String expectedOutput) {
    fizzBuzz = new FizzBuzz(RuleChains.getOriginalFizzBuzzRuleChain());

    this.number = number;
    this.expectedOutput = expectedOutput;
  }

  @Test
  public void name() {
    assertThat(fizzBuzz.execute(number))
        .isEqualTo(expectedOutput);
  }
}

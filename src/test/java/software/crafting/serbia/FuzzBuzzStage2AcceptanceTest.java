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
public class FuzzBuzzStage2AcceptanceTest {

  @Parameters
  public static Collection<Object[]> data() {
    return Arrays.asList(new Object[][]{
        {1, "1"},
        {4, "4"},
        {22, "22"},
        {16, "16"},
        {98, "98"},

        {3, "Fizz"},
        {6, "Fizz"},
        {9, "Fizz"},
        {99, "Fizz"},
        {33, "Fizz"},
        {18, "Fizz"},

        {13, "Fizz"},
        {23, "Fizz"},
        {31, "Fizz"},
        {37, "Fizz"},

        {5, "Buzz"},
        {10, "Buzz"},
        {20, "Buzz"},
        {25, "Buzz"},
        {50, "Buzz"},
        {100, "Buzz"},

        {52, "Buzz"},
        {56, "Buzz"},
        {58, "Buzz"},

        {30, "FizzBuzz"},
        {90, "FizzBuzz"}
    });
  }


  private final FizzBuzz fizzBuzz;

  private Integer number;
  private String expectedOutput;

  public FuzzBuzzStage2AcceptanceTest(Integer number, String expectedOutput) {
    fizzBuzz = new FizzBuzz(RuleChains.getStage2FizzBuzzRuleChain());

    this.number = number;
    this.expectedOutput = expectedOutput;
  }

  @Test
  public void name() {
    assertThat(fizzBuzz.execute(number))
        .isEqualTo(expectedOutput);
  }
}

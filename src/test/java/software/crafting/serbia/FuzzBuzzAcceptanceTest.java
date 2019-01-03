package software.crafting.serbia;

import org.junit.Before;
import org.junit.Test;
import software.crafting.serbia.rule.Rule;
import software.crafting.serbia.rule.RuleChainBuilder;
import software.crafting.serbia.rule.predicate.IsNumberDivisibleByFive;
import software.crafting.serbia.rule.predicate.IsNumberDivisibleByThree;
import software.crafting.serbia.rule.predicate.MatchAll;
import software.crafting.serbia.rule.transformer.BuzzTransformer;
import software.crafting.serbia.rule.transformer.FizzBuzzTransformer;
import software.crafting.serbia.rule.transformer.FizzTransformer;
import software.crafting.serbia.rule.transformer.NoOppTransformer;

import static org.assertj.core.api.Assertions.*;

public class FuzzBuzzAcceptanceTest {

  private FizzBuzz fizzBuzz;

  @Before
  public void setup() {
    Rule fizzBuzzRule = new Rule(new IsNumberDivisibleByThree().and(new IsNumberDivisibleByFive()), new FizzBuzzTransformer());
    Rule fizzRule = new Rule(new IsNumberDivisibleByThree(), new FizzTransformer());
    Rule buzzRule = new Rule(new IsNumberDivisibleByFive(), new BuzzTransformer());
    Rule otherRule = new Rule(new MatchAll(), new NoOppTransformer());

    fizzBuzz = new FizzBuzz(new RuleChainBuilder()
        .addNextRule(fizzBuzzRule)
        .addNextRule(fizzRule)
        .addNextRule(buzzRule)
        .addNextRule(otherRule)
        .createRuleChain());
  }

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

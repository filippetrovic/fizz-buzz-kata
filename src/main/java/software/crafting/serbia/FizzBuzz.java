package software.crafting.serbia;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FizzBuzz {

  private List<Rule> rules;

  public FizzBuzz() {
    Rule fizzBuzzRule = new Rule(new IsNumberDivisibleByThree().and(new IsNumberDivisibleByFive()), new FizzBuzzTransformer());
    Rule fizzRule = new Rule(new IsNumberDivisibleByThree(), new FizzTransformer());
    Rule buzzRule = new Rule(new IsNumberDivisibleByFive(), new BuzzTransformer());
    Rule otherRule = new Rule(new MatchAll(), new NoOppTransformer());

    rules = Arrays.asList(fizzBuzzRule, fizzRule, buzzRule, otherRule);
  }


  public String execute(int number) {
    for (Rule rule : rules) {
      if (rule.matches(number)) {
        return rule.transform(number);
      }
    }
    return null;
  }

  private static class MatchAll implements Predicate<Integer> {

    @Override
    public boolean test(Integer i) {
      return true;
    }
  }

  private static class NoOppTransformer implements Function<Integer, String> {

    @Override
    public String apply(Integer obj) {
      return String.valueOf(obj);
    }
  }
}

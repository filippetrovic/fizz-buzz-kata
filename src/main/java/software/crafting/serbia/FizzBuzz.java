package software.crafting.serbia;

import java.util.Arrays;
import java.util.List;

public class FizzBuzz {

  private final Rule fizzRule;
  private final Rule buzzRule;
  private final Rule fizzBuzzRule;

  private List<Rule> rules;

  public FizzBuzz() {
    fizzRule = new Rule(new FizzMatcher(), new FizzSupplier());
    buzzRule = new Rule(new BuzzMatcher(), new BuzzSupplier());
    fizzBuzzRule = new Rule(new FizzMatcher().and(new BuzzMatcher()), new FizzBuzzSupplier());

    rules = Arrays.asList(fizzBuzzRule, fizzRule, buzzRule);
  }


  public String execute(int number) {
    for (Rule rule : rules) {
      if (rule.matches(number)) {
        return rule.getNumberSubstitution();
      }
    }
    return unchanged(number);
  }

  private String unchanged(int number) {
    return String.valueOf(number);
  }

}

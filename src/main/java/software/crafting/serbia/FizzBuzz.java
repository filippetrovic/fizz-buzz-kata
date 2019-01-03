package software.crafting.serbia;

import java.util.Arrays;

public class FizzBuzz {

  private final RuleChain ruleChain;

  public FizzBuzz() {
    Rule fizzBuzzRule = new Rule(new IsNumberDivisibleByThree().and(new IsNumberDivisibleByFive()), new FizzBuzzTransformer());
    Rule fizzRule = new Rule(new IsNumberDivisibleByThree(), new FizzTransformer());
    Rule buzzRule = new Rule(new IsNumberDivisibleByFive(), new BuzzTransformer());
    Rule otherRule = new Rule(new MatchAll(), new NoOppTransformer());

    ruleChain = new RuleChain(Arrays.asList(fizzBuzzRule, fizzRule, buzzRule, otherRule));
  }


  public String execute(int number) {
    return ruleChain.transform(number);
  }

}

package software.crafting.serbia;

import software.crafting.serbia.rule.Rule;
import software.crafting.serbia.rule.RuleChain;
import software.crafting.serbia.rule.RuleChainBuilder;
import software.crafting.serbia.rule.predicate.IsNumberDivisibleByFive;
import software.crafting.serbia.rule.predicate.IsNumberDivisibleByThree;
import software.crafting.serbia.rule.predicate.MatchAll;
import software.crafting.serbia.rule.transformer.BuzzTransformer;
import software.crafting.serbia.rule.transformer.FizzBuzzTransformer;
import software.crafting.serbia.rule.transformer.FizzTransformer;
import software.crafting.serbia.rule.transformer.NoOppTransformer;

public class FizzBuzz {

  private final RuleChain ruleChain;

  public FizzBuzz() {
    Rule fizzBuzzRule = new Rule(new IsNumberDivisibleByThree().and(new IsNumberDivisibleByFive()), new FizzBuzzTransformer());
    Rule fizzRule = new Rule(new IsNumberDivisibleByThree(), new FizzTransformer());
    Rule buzzRule = new Rule(new IsNumberDivisibleByFive(), new BuzzTransformer());
    Rule otherRule = new Rule(new MatchAll(), new NoOppTransformer());

    ruleChain = new RuleChainBuilder()
        .addNextRule(fizzBuzzRule)
        .addNextRule(fizzRule)
        .addNextRule(buzzRule)
        .addNextRule(otherRule)
        .createRuleChain();
  }


  public String execute(int number) {
    return ruleChain.transform(number);
  }

}

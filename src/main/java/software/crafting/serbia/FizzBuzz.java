package software.crafting.serbia;

import software.crafting.serbia.predicate.IsNumberDivisibleByFive;
import software.crafting.serbia.predicate.IsNumberDivisibleByThree;
import software.crafting.serbia.predicate.MatchAll;
import software.crafting.serbia.rule.Rule;
import software.crafting.serbia.rule.RuleChain;
import software.crafting.serbia.rule.RuleChainBuilder;
import software.crafting.serbia.transformer.BuzzTransformer;
import software.crafting.serbia.transformer.FizzBuzzTransformer;
import software.crafting.serbia.transformer.FizzTransformer;
import software.crafting.serbia.transformer.NoOppTransformer;

import java.util.Arrays;

public class FizzBuzz {

  private final RuleChain ruleChain;

  public FizzBuzz() {
    Rule fizzBuzzRule = new Rule(new IsNumberDivisibleByThree().and(new IsNumberDivisibleByFive()), new FizzBuzzTransformer());
    Rule fizzRule = new Rule(new IsNumberDivisibleByThree(), new FizzTransformer());
    Rule buzzRule = new Rule(new IsNumberDivisibleByFive(), new BuzzTransformer());
    Rule otherRule = new Rule(new MatchAll(), new NoOppTransformer());

    ruleChain = new RuleChainBuilder()
        .setRules(Arrays.asList(fizzBuzzRule, fizzRule, buzzRule, otherRule))
        .createRuleChain();
  }


  public String execute(int number) {
    return ruleChain.transform(number);
  }

}

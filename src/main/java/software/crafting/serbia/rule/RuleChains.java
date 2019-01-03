package software.crafting.serbia.rule;

import software.crafting.serbia.rule.predicate.ContainsDigitFive;
import software.crafting.serbia.rule.predicate.ContainsDigitThree;
import software.crafting.serbia.rule.predicate.IsNumberDivisibleByFive;
import software.crafting.serbia.rule.predicate.IsNumberDivisibleByThree;
import software.crafting.serbia.rule.predicate.MatchAll;
import software.crafting.serbia.rule.transformer.BuzzTransformer;
import software.crafting.serbia.rule.transformer.FizzBuzzTransformer;
import software.crafting.serbia.rule.transformer.FizzTransformer;
import software.crafting.serbia.rule.transformer.NoOppTransformer;

import java.util.function.Predicate;

public class RuleChains {

  public static RuleChain getOriginalFizzBuzzRuleChain() {

    Rule fizzBuzzRule = new Rule(new IsNumberDivisibleByThree().and(new IsNumberDivisibleByFive()), new FizzBuzzTransformer());
    Rule fizzRule = new Rule(new IsNumberDivisibleByThree(), new FizzTransformer());
    Rule buzzRule = new Rule(new IsNumberDivisibleByFive(), new BuzzTransformer());
    Rule otherRule = new Rule(new MatchAll(), new NoOppTransformer());

    return new RuleChainBuilder()
        .addNextRule(fizzBuzzRule)
        .addNextRule(fizzRule)
        .addNextRule(buzzRule)
        .addNextRule(otherRule)
        .createRuleChain();
  }

  public static RuleChain getStage2FizzBuzzRuleChain() {
    final Predicate<Integer> fizzPredicate = new IsNumberDivisibleByThree().or(new ContainsDigitThree());
    final Predicate<Integer> buzzPredicate = new IsNumberDivisibleByFive().or(new ContainsDigitFive());

    final Rule fizzBuzzRule = new Rule(fizzPredicate.and(buzzPredicate), new FizzBuzzTransformer());
    final Rule fizzRule = new Rule(fizzPredicate, new FizzTransformer());
    final Rule buzzRule = new Rule(buzzPredicate, new BuzzTransformer());
    final Rule otherRule = new Rule(new MatchAll(), new NoOppTransformer());

    return new RuleChainBuilder()
        .addNextRule(fizzBuzzRule)
        .addNextRule(fizzRule)
        .addNextRule(buzzRule)
        .addNextRule(otherRule)
        .createRuleChain();
  }
}

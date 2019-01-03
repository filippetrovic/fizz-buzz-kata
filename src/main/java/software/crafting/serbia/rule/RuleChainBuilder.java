package software.crafting.serbia.rule;

import java.util.LinkedList;
import java.util.List;

public class RuleChainBuilder {

  private List<Rule> rules = new LinkedList<>();

  public RuleChain createRuleChain() {
    return new RuleChain(rules);
  }

  public RuleChainBuilder addNextRule(Rule fizzBuzzRule) {
    rules.add(fizzBuzzRule);
    return this;
  }
}
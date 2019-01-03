package software.crafting.serbia.rule;

import java.util.List;

public class RuleChainBuilder {

  private List<Rule> rules;

  public RuleChainBuilder setRules(List<Rule> rules) {
    this.rules = rules;
    return this;
  }

  public RuleChain createRuleChain() {
    return new RuleChain(rules);
  }
}
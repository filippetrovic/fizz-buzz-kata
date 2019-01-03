package software.crafting.serbia.rule;

import java.util.Collections;
import java.util.List;

public class RuleChain {

  private List<Rule> rules;

  public RuleChain(List<Rule> rules) {
    this.rules = Collections.unmodifiableList(rules);
  }

  public String transform(int number) {
    return rules.stream()
        .filter(rule -> rule.matches(number))
        .findFirst()
        .map(rule -> rule.transform(number))
        .orElseThrow(IllegalStateException::new);
  }
}
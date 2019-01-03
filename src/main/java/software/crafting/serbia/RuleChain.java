package software.crafting.serbia;

import java.util.List;

public class RuleChain {

  List<Rule> rules;

  public RuleChain() {
  }

  String transform(int number) {
    return rules.stream()
        .filter(rule -> rule.matches(number))
        .findFirst()
        .map(rule -> rule.transform(number))
        .orElseThrow(IllegalStateException::new);
  }
}
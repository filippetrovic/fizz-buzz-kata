package software.crafting.serbia;

import software.crafting.serbia.rule.RuleChain;

public class FizzBuzz {

  private final RuleChain ruleChain;

  public FizzBuzz(RuleChain ruleChain) {
    this.ruleChain = ruleChain;
  }


  public String execute(int number) {
    return ruleChain.transform(number);
  }

}

package software.crafting.serbia.rule.predicate;

import java.util.function.Predicate;

public class ContainsDigitFive implements Predicate<Integer> {

  @Override
  public boolean test(Integer number) {
    return String.valueOf(number).contains("5");
  }
}

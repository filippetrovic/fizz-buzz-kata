package software.crafting.serbia.rule.predicate;

import java.util.function.Predicate;

public class MatchAll implements Predicate<Integer> {

  @Override
  public boolean test(Integer i) {
    return true;
  }
}

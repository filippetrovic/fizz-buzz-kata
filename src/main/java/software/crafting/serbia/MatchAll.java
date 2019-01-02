package software.crafting.serbia;

import java.util.function.Predicate;

class MatchAll implements Predicate<Integer> {

  @Override
  public boolean test(Integer i) {
    return true;
  }
}

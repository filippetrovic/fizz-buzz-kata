package software.crafting.serbia;

import java.util.function.Predicate;

public class BuzzMatcher implements Predicate<Integer> {

  @Override
  public boolean test(Integer number) {
    return number % 5 == 0;
  }

}

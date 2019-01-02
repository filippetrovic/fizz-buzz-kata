package software.crafting.serbia;

import java.util.function.Predicate;

public class FizzMatcher implements Predicate<Integer> {

  @Override
  public boolean test(Integer number) {
    return number % 3 == 0;
  }

}

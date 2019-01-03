package software.crafting.serbia.predicate;

import java.util.function.Predicate;

public class IsNumberDivisibleByThree implements Predicate<Integer> {

  @Override
  public boolean test(Integer number) {
    return number % 3 == 0;
  }

}

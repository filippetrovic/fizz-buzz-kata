package software.crafting.serbia.predicate;

import java.util.function.Predicate;

public class IsNumberDivisibleByFive implements Predicate<Integer> {

  @Override
  public boolean test(Integer number) {
    return number % 5 == 0;
  }

}

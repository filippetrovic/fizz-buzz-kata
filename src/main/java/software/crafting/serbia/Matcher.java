package software.crafting.serbia;

import java.util.function.Predicate;

public interface Matcher extends Predicate<Integer> {
  boolean test(Integer number);
}

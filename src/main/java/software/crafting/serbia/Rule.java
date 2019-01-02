package software.crafting.serbia;

import java.util.function.Function;
import java.util.function.Predicate;

public class Rule {

  private Predicate<Integer> matcher;
  private  Function<Integer, String> supplier;

  public Rule(Predicate<Integer> matcher, Function<Integer, String> supplier) {
    this.matcher = matcher;
    this.supplier = supplier;
  }

  public boolean matches(int number) {
    return matcher.test(number);
  }

  public String getNumberSubstitution(Integer number) {
    return supplier.apply(number);
  }
}
package software.crafting.serbia;

import java.util.function.Function;
import java.util.function.Predicate;

public class Rule {

  private Predicate<Integer> matcher;
  private Function<Integer, String> transformer;

  public Rule(Predicate<Integer> matcher, Function<Integer, String> transformer) {
    this.matcher = matcher;
    this.transformer = transformer;
  }

  public boolean matches(int number) {
    return matcher.test(number);
  }

  public String transform(Integer number) {
    return transformer.apply(number);
  }
}
package software.crafting.serbia.rule.transformer;

import java.util.function.Function;

public class BuzzTransformer implements Function<Integer, String> {

  private static final String BUZZ = "Buzz";

  @Override
  public String apply(Integer number) {
    return BUZZ;
  }
}

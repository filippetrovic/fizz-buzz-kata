package software.crafting.serbia;

import java.util.function.Function;

public class FizzBuzzTransformer implements Function<Integer, String> {

  private static final String FIZZ_BUZZ = "FizzBuzz";

  @Override
  public String apply(Integer number) {
    return FIZZ_BUZZ;
  }
}

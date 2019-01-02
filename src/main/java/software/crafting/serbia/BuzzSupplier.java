package software.crafting.serbia;

import java.util.function.Function;

public class BuzzSupplier implements Function<Integer, String> {

  private static final String BUZZ = "Buzz";

  @Override
  public String apply(Integer number) {
    return BUZZ;
  }
}

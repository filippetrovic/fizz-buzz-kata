package software.crafting.serbia;

import java.util.function.Function;

public class FizzSupplier implements Function<Integer, String> {

  private static final String FIZZ = "Fizz";

  @Override
  public String apply(Integer number) {
    return FIZZ;
  }
}

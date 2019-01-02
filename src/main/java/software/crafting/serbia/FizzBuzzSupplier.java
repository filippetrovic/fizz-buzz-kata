package software.crafting.serbia;

public class FizzBuzzSupplier implements ValueSupplier {

  private static final String FIZZ_BUZZ = "FizzBuzz";

  @Override
  public String getValue() {
    return FIZZ_BUZZ;
  }
}

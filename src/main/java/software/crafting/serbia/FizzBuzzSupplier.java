package software.crafting.serbia;

public class FizzBuzzSupplier implements ValueSupplier {

  public static final String FIZZ_BUZZ = "FizzBuzz";

  @Override
  public String getValue() {
    return FIZZ_BUZZ;
  }
}

package software.crafting.serbia;

public class FizzBuzzSupplier implements ValueSupplier {

  @Override
  public String getValue() {
    return FizzBuzz.FIZZ_BUZZ;
  }
}

package software.crafting.serbia;

public class FizzSupplier implements ValueSupplier {

  private static final String FIZZ = "Fizz";

  @Override
  public String getValue() {
    return FIZZ;
  }
}

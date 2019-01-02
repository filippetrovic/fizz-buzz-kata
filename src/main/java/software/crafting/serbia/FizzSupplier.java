package software.crafting.serbia;

public class FizzSupplier implements ValueSupplier {

  public static final String FIZZ = "Fizz";

  @Override
  public String transform() {
    return FIZZ;
  }
}

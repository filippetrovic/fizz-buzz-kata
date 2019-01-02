package software.crafting.serbia;

public class BuzzSupplier implements ValueSupplier {

  @Override
  public String getValue() {
    return FizzBuzz.BUZZ;
  }
}

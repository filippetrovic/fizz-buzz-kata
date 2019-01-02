package software.crafting.serbia;

public class BuzzSupplier implements ValueSupplier {

  private static final String BUZZ = "Buzz";

  @Override
  public String getValue() {
    return BUZZ;
  }
}

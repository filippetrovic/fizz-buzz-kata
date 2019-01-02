package software.crafting.serbia;

public class FizzRule {

  private FizzMatcher fizzMatcher = new FizzMatcher();
  private FizzSupplier fizzSupplier = new FizzSupplier();

  public FizzRule() {
  }

  public FizzMatcher getFizzMatcher() {
    return fizzMatcher;
  }

  public FizzSupplier getFizzSupplier() {
    return fizzSupplier;
  }

}
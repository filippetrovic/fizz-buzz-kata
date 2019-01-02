package software.crafting.serbia;

public class FizzRule {

  private FizzMatcher fizzMatcher;
  private FizzSupplier fizzSupplier;

  public FizzRule(FizzMatcher fizzMatcher, FizzSupplier fizzSupplier) {
    this.fizzMatcher = fizzMatcher;
    this.fizzSupplier = fizzSupplier;
  }

  public boolean matches(int number) {
    return fizzMatcher.matches(number);
  }

  public String transform() {
    return fizzSupplier.transform();
  }
}
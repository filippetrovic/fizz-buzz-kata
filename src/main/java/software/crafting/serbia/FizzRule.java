package software.crafting.serbia;

public class FizzRule {

  private FizzMatcher fizzMatcher = new FizzMatcher();
  private FizzSupplier fizzSupplier = new FizzSupplier();

  public FizzRule() {
  }

  public boolean matches(int number) {
    return fizzMatcher.matches(number);
  }

  public String transform() {
    return fizzSupplier.transform();
  }
}
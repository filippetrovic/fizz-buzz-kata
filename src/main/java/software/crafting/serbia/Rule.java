package software.crafting.serbia;

public class Rule {

  private Matcher matcher;
  private FizzSupplier supplier;

  public Rule(Matcher matcher, FizzSupplier supplier) {
    this.matcher = matcher;
    this.supplier = supplier;
  }

  public boolean matches(int number) {
    return matcher.matches(number);
  }

  public String transform() {
    return supplier.transform();
  }
}
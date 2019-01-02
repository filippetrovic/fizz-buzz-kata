package software.crafting.serbia;

public class Rule {

  private Matcher matcher;
  private ValueSupplier supplier;

  public Rule(Matcher matcher, ValueSupplier supplier) {
    this.matcher = matcher;
    this.supplier = supplier;
  }

  public boolean matches(int number) {
    return matcher.test(number);
  }

  public String getNumberSubstitution() {
    return supplier.getValue();
  }
}
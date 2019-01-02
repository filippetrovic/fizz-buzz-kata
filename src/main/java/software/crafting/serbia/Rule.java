package software.crafting.serbia;

import java.util.function.Predicate;

public class Rule {

  private Predicate<Integer> matcher;
  private ValueSupplier supplier;

  public Rule(Predicate<Integer> matcher, ValueSupplier supplier) {
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
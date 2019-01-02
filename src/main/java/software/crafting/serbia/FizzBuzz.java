package software.crafting.serbia;

public class FizzBuzz {

  public static final String BUZZ = "Buzz";
  public static final String FIZZ_BUZZ = "FizzBuzz";

  private final Rule fizzRule = new Rule(new FizzMatcher(), new FizzSupplier());
  private final Rule buzzRule = new Rule(new BuzzMatcher(), new BuzzSupplier());
  private final Rule fizzBuzzRule = new Rule(new FizzMatcher().and(new BuzzMatcher()), new FizzBuzzSupplier());


  public String execute(int number) {
    if (fizzBuzzRule.matches(number)) {
      return fizzBuzzRule.getNumberSubstitution();
    }

    if (fizzRule.matches(number)) {
      return fizzRule.getNumberSubstitution();
    }
    if (buzzRule.matches(number)) {
      return buzzRule.getNumberSubstitution();
    }
    return unchanged(number);
  }

  private boolean isFizzBuzz(int number) {
    return isFizz(number) && isBuzz(number);
  }

  private boolean isBuzz(int number) {
    return number % 5 == 0;
  }

  private String unchanged(int number) {
    return String.valueOf(number);
  }

  private boolean isFizz(int number) {
    return number % 3 == 0;
  }
}

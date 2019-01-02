package software.crafting.serbia;

public class FizzBuzz {

  public static final String BUZZ = "Buzz";
  public static final String FIZZ_BUZZ = "FizzBuzz";

  private final FizzRule fizzRule = new FizzRule(new FizzMatcher(), new FizzSupplier());

  public String execute(int number) {
    if (isFizzBuzz(number)) {
      return FIZZ_BUZZ;
    }

    if (fizzRule.matches(number)) {
      return fizzRule.transform();
    }
    if (isBuzz(number)) {
      return BUZZ;
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

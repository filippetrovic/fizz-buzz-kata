package software.crafting.serbia;

public class FizzBuzz {

  public static final String FIZZ = "Fizz";

  public String execute(int number) {
    if (isFizz(number)) {
      return FIZZ;
    }
    if (isBuzz(number)) {
      return "Buzz";
    }
    return unchanged(number);
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

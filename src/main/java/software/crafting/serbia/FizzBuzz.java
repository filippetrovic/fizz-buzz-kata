package software.crafting.serbia;

public class FizzBuzz {

  public static final String FIZZ = "Fizz";

  public String execute(int number) {
    if (isFizz(number)) {
      return FIZZ;
    }
    return unchanged(number);
  }

  private String unchanged(int number) {
    return String.valueOf(number);
  }

  private boolean isFizz(int number) {
    return number % 3 == 0;
  }
}

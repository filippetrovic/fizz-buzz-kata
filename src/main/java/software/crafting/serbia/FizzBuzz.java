package software.crafting.serbia;

public class FizzBuzz {

  public static final String FIZZ = "Fizz";

  public String execute(int number) {
    if (number % 3 == 0) {
      return FIZZ;
    }
    return String.valueOf(number);
  }
}

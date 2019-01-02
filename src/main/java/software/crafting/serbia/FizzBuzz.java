package software.crafting.serbia;

public class FizzBuzz {

  public String execute(int number) {
    if (number % 3 == 0) {
      return "Fizz";
    }
    return String.valueOf(number);
  }
}

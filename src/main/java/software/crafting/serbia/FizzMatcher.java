package software.crafting.serbia;

public class FizzMatcher implements Matcher {


  @Override
  public boolean matches(int number) {
    return number % 3 == 0;
  }
}

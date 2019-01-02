package software.crafting.serbia;

public class BuzzMatcher implements Matcher {

  @Override
  public boolean matches(int number) {
    return number % 5 == 0;
  }
}

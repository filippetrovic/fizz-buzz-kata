package software.crafting.serbia;

public class BuzzMatcher implements Matcher {

  @Override
  public boolean test(Integer number) {
    return number % 5 == 0;
  }
}

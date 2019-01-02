package software.crafting.serbia;

public class FizzMatcher implements Matcher {


  @Override
  public boolean test(Integer number) {
    return number % 3 == 0;
  }
}

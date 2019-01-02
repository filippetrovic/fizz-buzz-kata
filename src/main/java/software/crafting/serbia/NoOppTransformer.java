package software.crafting.serbia;

import java.util.function.Function;

class NoOppTransformer implements Function<Integer, String> {

  @Override
  public String apply(Integer obj) {
    return String.valueOf(obj);
  }
}

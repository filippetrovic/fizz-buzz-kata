package software.crafting.serbia.rule.transformer;

import java.util.function.Function;

public class NoOppTransformer implements Function<Integer, String> {

  @Override
  public String apply(Integer obj) {
    return String.valueOf(obj);
  }

}

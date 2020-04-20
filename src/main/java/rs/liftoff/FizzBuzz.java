package rs.liftoff;

class FizzBuzz {

  public String transform(int value) {
    if (isFizz(value) && isBuzz(value)) {
      return "FizzBuzz";
    }
    if (isFizz(value)) {
      return "Fizz";
    }
    if (isBuzz(value)) {
      return "Buzz";
    }
    return String.valueOf(value);
  }

  private boolean isBuzz(int value) {
    return value % 5 == 0;
  }

  private boolean isFizz(int value) {
    return value % 3 == 0;
  }
}

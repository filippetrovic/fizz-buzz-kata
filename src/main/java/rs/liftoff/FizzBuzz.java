package rs.liftoff;

class FizzBuzz {

  public String transform(int value) {
    if (isFizz(value) && value % 5 == 0) {
      return "FizzBuzz";
    }
    if (isFizz(value)) {
      return "Fizz";
    }
    if (value % 5 == 0) {
      return "Buzz";
    }
    return String.valueOf(value);
  }

  private boolean isFizz(int value) {
    return value % 3 == 0;
  }
}

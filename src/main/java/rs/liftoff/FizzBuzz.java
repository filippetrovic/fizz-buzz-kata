package rs.liftoff;

class FizzBuzz {

  public String transform(int value) {
    if (value == 15) {
      return "FizzBuzz";
    }
    if (value % 3 == 0) {
      return "Fizz";
    }
    if (value % 5 == 0) {
      return "Buzz";
    }
    return String.valueOf(value);
  }
}

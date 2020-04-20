package rs.liftoff;

class FizzBuzz {

  public String transform(int value) {
    if (value % 3 == 0) {
      return "Fizz";
    }
    return String.valueOf(value);
  }
}

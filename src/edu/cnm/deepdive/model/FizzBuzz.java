package edu.cnm.deepdive.model;

public enum FizzBuzz {
  FIZZ,
  BUZZ,
  FIZZ_BUZZ,
  NEITHER;

  @Override
  public String toString() {
    return super.toString().toLowerCase().replace('_', '-');
  }

  public static FizzBuzz fromInt(int value) {
    FizzBuzz result;
    if (value % 3 == 0) {
      if (value % 5 == 0) {
        result = FizzBuzz.FIZZ_BUZZ;
      } else {
        result = FizzBuzz.FIZZ;
      }
    } else if (value % 5 == 0) {
      result = FizzBuzz.BUZZ;
    } else {
      result = FizzBuzz.NEITHER;
    }
    return result;
  }
}

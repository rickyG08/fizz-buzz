package edu.cnm.deepdive.model;

public class Converter {

  public static FizzBuzz convert(int value) {
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

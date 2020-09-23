package edu.cnm.deepdive.view;

import edu.cnm.deepdive.model.FizzBuzz;

public class FIzzBuzzString {

  public static String format(FizzBuzz value) {
      return value.toString().toLowerCase().replace('_', '-');
  }

}

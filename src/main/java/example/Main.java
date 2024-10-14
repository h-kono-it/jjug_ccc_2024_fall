package example;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    FizzBuzz fizzBuzz = new FizzBuzz();
    int[] numberArray = fizzBuzz.createNumberArray(100);
    Arrays.stream(numberArray).mapToObj(fizzBuzz::calcFizzBuzz).forEach(System.out::println);
  }
}

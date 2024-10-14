package example;

import java.util.stream.IntStream;

public class FizzBuzz {

  public int[] createNumberArray(final int endNumber){
    return IntStream.rangeClosed(1, endNumber).toArray();
  }

  public String calcFizzBuzz(int i){
    if (i % 15 == 0){
      return "FizzBuzz";
    }else if (i % 3 == 0){
      return "Fizz";
    } else if(i % 5 == 0){
      return "Buzz";
    }
    return String.valueOf(i);
  }
}

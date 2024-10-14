package example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFizzBuzz {

  @Test
  public void calcFizzBuzz関数は3と5の倍数ならFizzBuzzを返す(){
    FizzBuzz fizzBuzz = new FizzBuzz();
    int input = 30;
    String actual = fizzBuzz.calcFizzBuzz(input);
    assertEquals("FizzBuzz", actual);
  }

  @Test
  public void calcFizzBuzz関数は3の倍数かつ5の倍数でないならFizzを返す(){
    FizzBuzz fizzBuzz = new FizzBuzz();
    int input = 6;
    String actual = fizzBuzz.calcFizzBuzz(input);
    assertEquals("Fizz", actual);
  }

  @Test
  public void calcFizzBuzz関数は3の倍数でないかつ5の倍数ならBuzzを返す(){
    FizzBuzz fizzBuzz = new FizzBuzz();
    int input = 10;
    String actual = fizzBuzz.calcFizzBuzz(input);
    assertEquals("Buzz", actual);
  }

  @Test
  public void calcFizzBuzz関数は3の倍数でも5の倍数でもないなら数値をそのまま返す(){
    FizzBuzz fizzBuzz = new FizzBuzz();
    int input = 11;
    String actual = fizzBuzz.calcFizzBuzz(input);
    assertEquals(String.valueOf(input), actual);
  }

  @Test
  public void createNumberArray関数は1から与えられた数値のint配列を返す() {
    FizzBuzz fizzBuzz = new FizzBuzz();
    int input = 5;
    int[] actual = fizzBuzz.createNumberArray(input);
    assertArrayEquals(new int[]{1, 2, 3, 4, 5}, actual);
  }
}

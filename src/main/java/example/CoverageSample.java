package example;

import java.util.ArrayList;
import java.util.List;

public class CoverageSample {
  public String sample(boolean conditionA, boolean conditionB, boolean conditionC, boolean conditionD) {
    List<String> result = new ArrayList<>();

    if (conditionA || conditionB) { // 判定条件X
      result.add("hoge");
    }
    if (conditionC || conditionD) { // 判定条件Y
      result.add("fuga");
    } else {
      result.add("piyo");
    }

    return String.join(",", result);
  }
}

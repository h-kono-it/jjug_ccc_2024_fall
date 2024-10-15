package example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCoverageSample {

  @Test
  public void C0を満たすテスト(){
    CoverageSample coverageSample = new CoverageSample();
    String actual1 = coverageSample.sample(true, false, true, false);
    assertEquals("hoge,fuga", actual1);

    String actual2 = coverageSample.sample(true, false, false, false);
    assertEquals("hoge,piyo", actual2);
  }

  @Test
  public void C1を満たすテスト(){
    CoverageSample coverageSample = new CoverageSample();
    String actual1 = coverageSample.sample(true, false, false, false);
    assertEquals("hoge,piyo", actual1);

    String actual2 = coverageSample.sample(false, false, true, false);
    assertEquals("fuga", actual2);
  }

  @Test
  public void C2を満たすテスト(){
    CoverageSample coverageSample = new CoverageSample();
    String actual1 = coverageSample.sample(true, false, true, false);
    assertEquals("hoge,fuga", actual1);

    String actual2 = coverageSample.sample(false, true, false, true);
    assertEquals("hoge,fuga", actual2);
  }


  @Test
  public void CMMを満たすテスト(){
    CoverageSample coverageSample = new CoverageSample();
    String actual1 = coverageSample.sample(true, true, true, true);
    assertEquals("hoge,fuga", actual1);

    String actual2 = coverageSample.sample(true, true, true, false);
    assertEquals("hoge,fuga", actual2);

    String actual3 = coverageSample.sample(true, true, false, true);
    assertEquals("hoge,fuga", actual3);

    String actual4 = coverageSample.sample(true, true, false, false);
    assertEquals("hoge,piyo", actual4);

    String actual5 = coverageSample.sample(true, false, true, true);
    assertEquals("hoge,fuga", actual5);

    String actual6 = coverageSample.sample(true, false, true, false);
    assertEquals("hoge,fuga", actual6);

    String actual7 = coverageSample.sample(true, false, false, true);
    assertEquals("hoge,fuga", actual7);

    String actual8 = coverageSample.sample(true, false, false, false);
    assertEquals("hoge,piyo", actual8);

    String actual9 = coverageSample.sample(false, true, true, true);
    assertEquals("hoge,fuga", actual9);

    String actual10 = coverageSample.sample(false, true, true, false);
    assertEquals("hoge,fuga", actual10);

    String actual11 = coverageSample.sample(false, true, false, true);
    assertEquals("hoge,fuga", actual11);

    String actual12 = coverageSample.sample(false, true, false, false);
    assertEquals("hoge,piyo", actual12);

    String actual13 = coverageSample.sample(false, false, true, true);
    assertEquals("fuga", actual13);

    String actual14 = coverageSample.sample(false, false, true, false);
    assertEquals("fuga", actual14);

    String actual15 = coverageSample.sample(false, false, false, true);
    assertEquals("fuga", actual15);

    String actual16 = coverageSample.sample(false, false, false, false);
    assertEquals("piyo", actual16);
  }
}

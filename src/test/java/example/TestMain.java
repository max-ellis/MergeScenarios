package example;

import example.Main;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.After;
import org.junit.Before; 


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TestMain {
  private final ByteArrayOutputStream content = new ByteArrayOutputStream();
  private final PrintStream originalOut = System.out;

  @Before
  public void setUpStream() {
    System.setOut(new PrintStream(content));
  }

  @Test
  public void assertIntTest() {
    A a = new A();
    int x = a.foo();
    assertEquals(x, 20);
  }

/*  @Test
  public void assertValTest() {
    Child1 child1 = new Child1();
    int y = child1.barNew();
    assertEquals(y, 20);
  }
*/


  @After
  public void restoreStream() {
    System.setOut(originalOut);
  }

}

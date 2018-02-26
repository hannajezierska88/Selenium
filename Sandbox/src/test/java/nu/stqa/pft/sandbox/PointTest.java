package nu.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTest {
  @Test

  public void testPoint(){
    Point p1 = new Point(2.7, 4.3);
    Point p2 = new Point (6.4, 10.7);

    Assert.assertEquals(p1.distance(p2), 7.392563831310487 );

  }
}

package package1;

public class TwoPointsDistance {

  public static void main(String[] args){

   Point p1 = new Point(2.7, 4.3);
   Point p2 = new Point (6.4, 10.7);

   double distance = p1.distance(p1, p2);

    System.out.println("The distance beetwen (" + p1.x + "," + p1.y + ") and (" + p2.x + "," + p2.y + ") is " + distance + ".");
  }

}

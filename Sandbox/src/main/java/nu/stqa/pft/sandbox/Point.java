package nu.stqa.pft.sandbox;

public class Point {

  public double x;
  public double y;


  public Point(double x, double y){
    this.x = x;
    this.y = y;

  }

  public double distance(Point p){
    double distance = Math.sqrt ((x - p.x)*(x - p.x) + (y - p.y)*(y - p.y));
    return distance;

  }

  public static void main(String[] args){

    Point p1 = new Point(2.7, 4.3);
    Point p2 = new Point (6.4, 10.7);

    double distance = p1.distance(p2);
    System.out.println("The distance between point p1 (" + p1.x + "," + p1.y + ") and  point p2 (" + p2.x + "," + p2.y + ") is " + distance+ ".");
  }

}

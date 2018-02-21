package package1;

public class Point {

  public double x;
  public double y;


  public Point(double x, double y){
    this.x = x;
    this.y = y;

  }

  public double distance(Point a, Point b){
    double dx = a.x - b.x;
    double dy = a.y - b.y;
    double distance = Math.sqrt(dx * dx + dy *dy);
    return distance;
  }

  public static void main(String[] args){

    Point p1 = new Point(2.7, 4.3);
    Point p2 = new Point (6.4, 10.7);

    double distance = p1.distance(p1,p2);




    System.out.println("The distance between (" + p1.x + "," + p1.y + ") and (" + p2.x + "," + p2.y + ") is " + distance + ".");
  }

}

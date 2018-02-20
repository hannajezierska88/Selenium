package package1;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello(" world ");
    hello(" Hanna ");

    Square s = new Square(5);
    System.out.println("Powierz boku " + s.l + " = " + area(s));

    Rectangle r = new Rectangle(4, 6);
    System.out.println("Pow prostokata o bokach " + r.a + " i " + r.b + " = " + area(r));
    double len = 5;


    double a = 4;
    double b = 6;


  }

  public static void hello(String somebody) {

    System.out.println("Hello," + somebody + "!");
  }

  public static double area(Square s) {
    return s.l * s.l;
  }

  public static double area(Rectangle r) {
    return r.a * r.b;
  }
}
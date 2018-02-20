package package1;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello(" world ");
    hello(" Hanna ");

    Square s = new Square(5);
    System.out.println("Powierz boku " + s.l + " = " + s.area());

    Rectangle r = new Rectangle(4, 6);
    System.out.println("Pow prostokata o bokach " + r.a + " i " + r.b + " = " + r.area(a));
    double len = 5;


    double a = 4;
    double b = 6;


  }

  public static void hello(String somebody) {

    System.out.println("Hello," + somebody + "!");
  }



}
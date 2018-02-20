package package1;

public class MyFirstProgram {

    public static void main(String[] args) {
        hello("world");
        hello ("Hana");

        double len = 5;
        System.out.println("Powierz boku " + len + " = " + area(len));

        double a = 4;
        double b = 6;
        System.out.println("Pow prostokata o bokach " + a + " i " +  b  + " = " + area(a, b));

    }

    public static void hello(String somebody){

        System.out.println("Hello," + somebody + "!");
    }
    public static double area(double len){
        return len * len;
    }

    public static double area(double a, double b){
        return a * b;
    }
}
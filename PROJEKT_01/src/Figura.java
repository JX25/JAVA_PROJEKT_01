import java.util.Scanner;

public abstract class Figura{
    Scanner scanner = new Scanner(System.in);
    abstract double calculateArea();
    abstract  double calculatePerimeter();
}
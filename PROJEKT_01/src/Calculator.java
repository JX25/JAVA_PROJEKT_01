import java.util.Scanner;

public class Calculator {

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Projekt 01, prosty kalkulator pol i obwodow figur 2D");
        System.out.println("1. Wybor figury.\n0. Wyjscie");

        int wybor = scanner.nextInt();
        while(wybor!=0)
        {
            if(wybor==1)
            {
                System.out.println("Wybierz figure\n1.Trojkat\n2.Kwadrat\n3.Kolo");
                int ktoraFigura= scanner.nextInt();
                switch(ktoraFigura)
                {
                    case 1:
                        Triangle tr = new Triangle();
                        tr.print();
                        break;
                    case 2:
                        Square sq = new Square();
                        sq.print();
                         break;
                    case 3:
                        Circle cr = new Circle();
                        cr.print();
                        break;
                    default:
                        System.out.println("Brak takiej opcji!");
                        break;

                }
            }
            else{
                System.out.println("Brak takiej opcji");
            }

            System.out.println("Wybierz dzialanie:\n1.Wybor figury\n0.Wyjscie");
            wybor= scanner.nextInt();
        }
    }

}

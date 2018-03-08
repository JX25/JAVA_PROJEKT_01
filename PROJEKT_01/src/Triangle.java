import java.util.concurrent.ExecutionException;

public class Triangle extends Figura
        implements Print{

    private double a,b,c;

    public Triangle() {

        String aa,bb,cc;
        System.out.println("Podaj dlugosc bokow trojkata:");

        while(true) {
            try {
                System.out.print("Bok a=");
                aa = scanner.nextLine();
                a = Double.parseDouble(aa);
                if( a<=0 ) throw new Exception();

                System.out.print("Bok b=");
                bb = scanner.nextLine();
                b = Double.parseDouble(bb);
                if( b<=0 ) throw new Exception();

                System.out.print("Bok c=");
                cc = scanner.nextLine();
                c = Double.parseDouble(cc);
                if( c<=0 ) throw new Exception();

                if( a>=b+c || b>=a+c || c>=a+b ) System.out.println("Nie mozna zbudowac kwadratu z takich bokow");
                else break;
            } catch (Exception e) {
                System.out.println("Blad! Niepoprwanie wpisane dane");
                System.out.print("Podaj dlugosc promienia jeszcze raz ");
            }
        }




    }

    public double calculateArea()
    {
        double polowaObwodu=calculatePerimeter()/2;
        return ( Math.sqrt( polowaObwodu*(polowaObwodu-a)*(polowaObwodu-b)*(polowaObwodu-c) ) );

    };

    public double calculatePerimeter()
    {
        return (a+b+c);
    };

    public void print()
    {
        System.out.println("\n");
        System.out.println("Wybrana figura: trojkat");
        System.out.println("Dlugosc bokow: a="+a+", b="+b+", c="+c);
        System.out.println("Obwod figury: "+ calculatePerimeter() );
        System.out.println("Pole figury:"+ calculateArea());
        System.out.println("\n");
    };


}



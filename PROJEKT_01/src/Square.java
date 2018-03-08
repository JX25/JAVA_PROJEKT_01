public class Square extends  Figura
        implements Print {
    private double a;

    public Square() {
        String aa;
        System.out.print("Podaj dlugosc boku kwadratu: a=");

        while(true) {
            try {
                aa = scanner.nextLine();
                a = Double.parseDouble(aa);
                if(a<=0) throw new Exception();
                break;
            } catch (Exception e) {
                System.out.println("Blad! Niepoprwanie wpisane dane");
                System.out.print("Podaj dlugosc boku jeszcze raz a=");
            }
        }

    }

    public double calculateArea()
    {
        return (a*a);
    };

    public double calculatePerimeter()
    {
        return (4*a);
    };

    public void print()
    {
        System.out.println("\n");
        System.out.println("Wybrana figura: kwadrat");
        System.out.println("Dlugosc boku: a="+a);
        System.out.println("Obwod kwadratu="+ calculatePerimeter() );
        System.out.println("Pole kwadratu="+ calculateArea());
        System.out.print("\n");
    };


}

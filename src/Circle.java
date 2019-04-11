public class Circle extends Figura
        implements Print  {
    private double r;

    public Circle() {

        String rr;
        System.out.print("Podaj dlugosc promienia kola: r=");

        while(true) {
            try {
                rr = scanner.nextLine();
                r = Double.parseDouble(rr);
                if(r<=0) throw new Exception();
                break;
            } catch (Exception e) {
                System.out.println("Blad! Niepoprwanie wpisane dane");
                System.out.print("Podaj dlugosc promienia jeszcze raz r=");
            }
        }
    }

    public double calculateArea()
    {
        return (3.14*r*r);
    };

    public double calculatePerimeter()
    {
        return (2*3.14*r);
    };

    public void print()
    {
        System.out.println("\n");
        System.out.println("Wybrana figura: kolo");
        System.out.println("Dlugosc promienia: r="+r);
        System.out.println("Obwod kola: "+ calculatePerimeter() );
        System.out.println("Pole kola:"+ calculateArea());
        System.out.print("\n");
    };


}

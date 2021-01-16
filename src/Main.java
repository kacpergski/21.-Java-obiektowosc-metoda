public class Main {

    public static void main(String[] args) {

        char red[] = {'r', 'e', 'd'};
        char blue[] = {'b', 'l', 'u', 'e'};
        Radiator r1 = new Radiator(red, 20, 6023);
        Radiator r2 = new Radiator(blue, 30, 805);
        Radiator r3 = new Radiator(red, 15, 3212);

        Radiator[] radiators = new Radiator[3];
        radiators[0] = r1;
        radiators[1] = r2;
        radiators[2] = r3;

        for (Radiator r : radiators) {

            System.out.print("Color: ");
            for (char radiatorColor : r.color) {
                System.out.print(radiatorColor);

            }
            System.out.println();
            System.out.println("Weight: " + r.weight);
            System.out.println("Power: " + r.power);
            System.out.println();

        }

        radiators[1].weight = 10;



            System.out.print("Color: ");
            for (char radiatorColor : radiators[1].color) {
                System.out.print(radiatorColor);

            }
            System.out.println();
            System.out.println("Weight: " + radiators[1].weight);
            System.out.println("Power: " + radiators[1].power);
            System.out.println();

        System.out.println("And now by display method");

        for (Radiator r : radiators) {
            r.display();
        }

        radiators[2].weight = 1000;

        radiators[2].display();
        double powerInkW = radiators[2].powerInkW();
        System.out.println("Power in kW: " + powerInkW + " kW");


        // zadanie 3

        MiniCalculator o1 = new MiniCalculator();  //s nowy obiekt klasy MiniCalcualtor
       // int suma = o1.sum(3,4);          //wywołanie metody na obiekcie i przypisanie do zmiennej suma
      //  System.out.println("Suma 3 + 4 = " + suma); // wyświetlenie zwróconego do zmienneej "suma" wyniku
     //    suma = o1.sum(103,44);          //wywołanie metody na obiekcie
       // System.out.println("Suma " +o1.a + " + " + o1.b +" = " + suma); // wyświetlenie zwróconego wyniku


        //System.out.println("Suma " +o1.a + " + " + o1.b +" = " + o1.sum(200,1));

        System.out.println("Suma 1+2+3+4+5 = " + o1.sum(1,2,3,4,5));

        // zadanie 4
        int[]values = {1,2,3,4,5};
        int sum = o1.sumArray(values);  // przypisanie wartosci zwaracanej przez metode sumArray obiektu o1 dla argumentów parametru values który jest tablicą
        System.out.println(sum);

        System.out.println(o1.avg(values)); // bez przypisania metoda dla obiektu o1 wywołana bezpośrenio do wypisania na ekranie

        // zadanie 5
        char [] yellow = {'y','e','l','l','o','w'};
        char [] green = {'g','r','e','e','n'};
        Amber a1 = new Amber(yellow,2, 3, 100 );
        Amber a2 = new Amber(green,3, 4, 130 );

        Amber [] ambers = new Amber[2];
        ambers[0] = a1;
        ambers[1] = a2;
        System.out.println("-------------------------------------");
        System.out.println("Zadanie 5  - Muzeum bursztynu");
        System.out.println();
        for ( Amber a: ambers){

            a.display();
        }

        //zwiekszenie gestosci o 100 i wyswietlenie wartoeci dla obiektow
        System.out.println("Density value of amber a1: + 100");
        System.out.println();

        a1.addAmberDensityIncreaseValue(100);   //zwiekszenie gestosci o 100

        for ( Amber a: ambers){
            a.display();
        }
    }
}

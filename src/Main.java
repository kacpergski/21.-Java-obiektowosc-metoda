public class Main {

    public static void main(String[] args) {

        char red[] = {'r', 'e', 'd'};
        char blue[] = {'b', 'l', 'u', 'e'};
        Radiator r1 = new Radiator(red, 20, 600);
        Radiator r2 = new Radiator(blue, 30, 800);
        Radiator r3 = new Radiator(red, 15, 300);

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
    }
}

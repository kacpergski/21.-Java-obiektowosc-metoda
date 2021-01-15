public class Radiator {
    char[] color;
    double weight;
    int power;

    Radiator(char[] color, double weight, int power){
        this.color = color;
        this.weight = weight;
        this.power =  power;
    }

    void display(){

            System.out.print("Color: ");
            for (char radiatorColor : color) {
                System.out.print(radiatorColor);

            }
            System.out.println();
            System.out.println("Weight: " + weight);
            System.out.println("Power: " + power);
            System.out.println();




    }

}

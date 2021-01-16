public class Paint {

    char symbol;
    int sizeOfSquare;


    Paint(char symbol, int sizeOfSquare) {
        this.symbol = symbol;
        this.sizeOfSquare = sizeOfSquare;
    }


    void display() {
        System.out.println("Symbol: " + "'" + symbol + "'");
        System.out.println("Size of square: " + sizeOfSquare);
        System.out.println();

        int i=0;
        while (i < sizeOfSquare){
            int j=0;
        while (j < sizeOfSquare){
            System.out.print(symbol);
            j++;
        }
            System.out.println();
            i++;
        }

    }
}
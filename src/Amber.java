import java.sql.SQLOutput;

public class Amber {

    char [] amberColor;
    int amberHardness;
    double amberDensity;
    double amberMeltingTempC;
    double amberMeltingTempF;
    //double amberDensityIncreaseValue;

    Amber(char[]amberColor,int amberHardness, int amberDensity, int amberMeltingTempC){
            this.amberColor = amberColor;
            this.amberHardness = amberHardness;
            this.amberDensity = amberDensity;
            this.amberMeltingTempC =amberMeltingTempC;

    }
    double amberMeltingTempF (){
        double F = (amberMeltingTempC *9/5)-32;
        return F;
    }

    double addAmberDensityIncreaseValue(double add)
    {
     amberDensity = add + amberDensity;
     return amberDensity;
    }
       void display () {

           System.out.print("Color of Amber: ");
        for (char amberColorTmp: amberColor){
            System.out.print(amberColorTmp);
        }
           System.out.println();
           System.out.print("Hardenss of Amber: ");
        System.out.println(amberHardness);
           System.out.print("Density of Amber: ");
           System.out.println(amberDensity);
           System.out.print("Melting temp in C of Amber: ");
           System.out.println(amberMeltingTempC + " C ");
           System.out.print("Melting temp in F of Amber: ");
           System.out.println(((amberMeltingTempC *9/5)-32) +" F ");
           System.out.println();
    }



}

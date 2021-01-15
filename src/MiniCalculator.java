public class MiniCalculator {
   // int a;
   // int b;

int sum (int a, int b, int c, int d, int e){
   // this.a = a;
   // this.b = b;

    return a+b+c+d+e;
}

int sumArray (int[] values){
    int suma = 0;
    for (int v : values){
        suma += v;
            }
    return suma;
}

 double avg( int[] values){
return sumArray(values)/values.length;

 }
}

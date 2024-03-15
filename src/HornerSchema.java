//Gruppenarbeit mit Tobi evalHorner und evalHornerRec
public class HornerSchema{
  public static double evalSimple(double[] a, double x) {
    double result=0;
    int length=a.length;
    int i=0;
    while(i<length){
      result+=a[i]*Math.pow(x,i); //(ai * x^i), math.pow to have double with power int
      i++;
    }
    return result;
  }
  public static double evalHorner(double[] a, double x){
    double result= 0;
    for (int i = a.length - 1; i >= 0; i--){// i=highest power of polynomial
      result = a[i] + (x * result);
    }
    return result;
  }
  public static double evalHornerRec(double[] a, double x) {
      int power= a.length-1; //highest power of the polynomial
      return hornerrec(a,x,power,0);
  }
  public static double hornerrec(double[] a, double x, int power,double result) {
    if(power==0){ //breaks recursion when the power is 0 (a0)
      return result*x+a[0];
    }
    return hornerrec(a,x,power-1,result*x+a[power]); //reduces power and repeats for the rest of the polynomial
  }
  public static void main (String args[]) {
    double[]a={1,2,3};
    System.out.println(evalHorner(a,2));
    System.out.println(evalSimple(a,2));
    System.out.println(evalHornerRec(a,2));
  }
}
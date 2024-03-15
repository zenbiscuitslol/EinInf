import java.util.Arrays;

public class Polynomial {
    private int degree; // highest power of x
    private double[] coeffs; // Array with coefficients, all coefficients [0..degree] are necessary
    public Polynomial(double[] c) {
        // TODO: Fill degree and array coeffs
        this.degree=c.length-1;
        this.coeffs=c;
    }
    public int getDegree(){
        // TODO: Largest exponent, highest power of x
        int deg=this.degree;
        while (coeffs[deg]==0 && deg>0){ //checks if coefficient is 0, if yes then takes previous degree
            deg--;
        }
        return deg;
    }
    public double[] getAllCoefficients(){   
        // TODO: All coefficients
        return this.coeffs;
    }
    public double getCoefficient(int i){
        // TODO: x^i - coefficient
        return this.coeffs[i];
    }
    public String toString() {
        // TODO: Implementation
        String poly="";
        int i=this.getDegree();
        while (i>=0 && coeffs[i]==0){ //skips if coefficient is 0
            i--;
        }
        while (i>=0){
            double coefficient=coeffs[i];
            if(poly.length()!=0){ //makes sure that the string isnt empty
                poly+=(coefficient>0?"+":"-"); //adds -ve sign if coeff<0 and + if coeff>0
            }
            if(i==0 || coefficient!=1){
                poly+=coefficient;
            }
            if(i>0){
                poly+=(i>1?"x^"+i:"x"); //if degree>1 returns x^degree, else returns x
            }
            i--;
        }
        return poly;
    }
    public double evaluate(double x) { //code taken from HornerSchema
        // TODO: Horner's scheme
        double horner= 0;
        for(int i=this.getDegree();i>=0;i--){
            horner=(horner*x)+coeffs[i];
        }
        return horner;
    }
    public Polynomial differentiate() { //code taken from DifferentialPolynom
        // TODO: return first derivative
                // y=x^n, y'=n*x^(n-1)
        if (degree == 0) { //returns empty array when degree=0(constant)
            double[] leer= new double[0];
            return new Polynomial(leer);
        }
        double[] diff = new double[degree];
        for (int i = 0; i < degree; i++) {// multipiles the ith element with power i
            diff[i] = coeffs[i + 1] * (i + 1); // skips the 0th element as it is constant
        }
        return new Polynomial(diff);
    }
    
    public static void main(String[] args) {
        // TODO: test
        double[] poly= new double[]{1,2,3,4,5};
        Polynomial polynom=new Polynomial(poly);
        System.out.println(polynom);
        System.out.println(polynom.getDegree());
        System.out.println(Arrays.toString(polynom.getAllCoefficients()));
        System.out.println(polynom.differentiate().toString());
        System.out.println(polynom.evaluate(2));
    }
}
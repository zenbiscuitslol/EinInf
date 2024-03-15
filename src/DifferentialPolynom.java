import java.util.Arrays;

public class DifferentialPolynom {
   public static double[] diffPoly(double[] coeffs) {
      int degree = coeffs.length - 1;
      if (coeffs.length == 1) { //returns empty array when degree=0(constant)
         double[] leer= new double[0];
         return leer;
      }
      double[] diff = new double[degree];
      for (int i = 0; i < degree; i++) {// multipiles the ith element with power i
         diff[i] = coeffs[i + 1] * (i + 1); // skips the 0th element as it is constant
      }
      return diff;
   }
   public static void main(String[] args) {
      double[] coeffs = {1,3,5};
      double[] result = diffPoly(coeffs);
      System.out.println(Arrays.toString(result));
   }
}

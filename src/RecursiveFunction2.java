import java.util.Arrays;
public class RecursiveFunction2 {
   public static int marge(int n) {
	// TODO: source code
      if(n<0){
         throw new IllegalArgumentException("n muss >= 0 sein"); //returns error when n is not >0
      }
      if(n==0){
         return 1;
      }
      else{
         return n - homer(marge(n - 1));
      }
   }
   public static int homer(int n) {
	// TODO: source code
      if(n<0){
         throw new IllegalArgumentException("n muss >= 0 sein");
      }
      if(n==0){
         return 0;
      }
      else{
         return n - marge(homer(n - 1));
      }
   }
   public static boolean dispute(int n) {
	// TODO: source code
      return !(marge(n)==homer(n));
   }
   public static int[] differenceDisputes(int x) {
      // TODO: source code
      int[] dispute = new int[x + 1];
      int[] diffdispute = new int[x];
      for (int i = 0, j = 0; j <= x; i++) {// time without fighting
         if (dispute(i)) {
            dispute[j] = i;
            j++;
         }
         for (int k = 0; k < x; k++) { //adds the difference(how long they've fought)
            diffdispute[k] = dispute[k + 1] - dispute[k];
         }
      }
      return diffdispute;
   }
   public static void main(String args[]) {
	// TODO: test data
      System.out.println(Arrays.toString(differenceDisputes(10))); //fibonacci zahlen
      System.out.println(dispute(7));//wird in Frieden sein
      System.out.println(dispute(25));//wird im Streit sein
   }
}
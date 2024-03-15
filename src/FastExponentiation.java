/********************************************************
 Hier bitte Antwort zu Teil (1) als Kommentar einfuegen

 8192.0
 Recursive calls: 7
 ********************************************************/
public class FastExponentiation {
   public static int reccalls; //var to count recursive calls
   public static int itercalls; //var to count iter loops
   public static double fastPotRek(double x, int n){ //recursive method
      reccalls++; //+1 if method is called
         if (n == 0) { //returns 1 if n=0
            return 1;
         }
         else if (n%2==0 && n>1) { //checks if n is even
            //divides n by 2, gets (2^n/2)^2
            double x1=fastPotRek(x,n/2);
            return x1*x1;
         }
         else{
            return x*fastPotRek(x,n-1);
         }
   }
   public static double fastPotIter(double x, int n) {
      double ans =1.0;
      while(n>0){
         itercalls++;
         if(n%2!=0){ //checks if n is odd
            ans*=x;
            n--; //makes n even
         }
         x*=x; // n is even, so x^2 and n/2
         n/=2;
      }
      return ans;
   }
   public static void main(String[] args) {
      System.out.println(fastPotRek(2,25));
      System.out.println("Recursive calls: "+reccalls);
      System.out.println(fastPotIter(2,25));
      System.out.println("Iterative loops :"+itercalls);
   }
}
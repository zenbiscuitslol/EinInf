/**************************************
 fib1(5) = fib1(3) + fib1(4)
    = (fib1(1) + fib1(2)) + (fib1(2) + fib1(3))
    = ((fib1(0) + fib1(1)) + fib1(1) + fib1(2)) + (fib1(1) + fib1(2) + fib1(3))
    = ((fib1(0) + fib1(1)) + fib1(1) + (fib1(0) + fib(1)) + (fib1(1) + (fib(1)+fib1(1)) + fib1(3)) und geht weiter
***********************************************/
import java.math.*;

public class BigIntegerFibonacci {
    static int recursivecalls=0; //static variables can be used in multiple methods
    static int iterativecalls=0;
    public static BigInteger fib1(int n){
        recursivecalls++;
        if(n==0 || n==1){
            return BigInteger.ONE;
        }
        else{
            return (fib1(n-2).add(fib1(n-1)));
        }
    }
    public static BigInteger fib2(int n){
        if(n==0 || n==1){
            return BigInteger.ONE;
        }
        else{
            iterativecalls++;
            int i=1;
            BigInteger num1= BigInteger.ONE; //first 2 fibonacci numbers
            BigInteger num2= BigInteger.ONE;
            BigInteger nextfib=BigInteger.ZERO;//next fibonacci number
            while(i<n){
                nextfib=num1.add(num2); //adds previous 2 fib. no to get next fib. no
                num1=num2;//makes num1 the next num
                num2=nextfib;//makes num2 the found fibonacci num
                i++;
            }
            return nextfib;
        }
    }
    public static void main(String[] args) {
        int i=0;
        while(i<15) {
            System.out.println(fib1(i));
            i++;
        }
        System.out.println(fib1(23));
        System.out.println("Anzahl der rekursiven Aufrufe: "+recursivecalls);
        System.out.println(fib2(23));
        System.out.println("Anzahl der Schleifendurchläufe: "+iterativecalls);
        /*
        Anzahl der rekursiven Aufrufe: 95912
        Anzahl der Schleifendurchläufe: 1
        deswegen ist fib2 effizienter als fib1.
         */

    }
}
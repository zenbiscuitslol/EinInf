/**************************************
 ackermann(1, 10)=1024
 ackermann(2, 4)=65536
 ackermann(3, 3)=65536

 Die Berechnung gibt einen Fehler aus da die endgültige Antwort
 größer ist als das,was der Datentyp BigInteger aufnehmen kann
***********************************************/
import java.math.BigInteger;

public class AckermannFunction {
    public static BigInteger ackermann(BigInteger x, BigInteger y){
      // hier bitte Quelltext einfuegen
        if(y.equals(BigInteger.ZERO)){
            return BigInteger.ZERO;
        } else if (x.equals(BigInteger.ZERO)){
            return (y.multiply(BigInteger.TWO));
        } else if (y.equals(BigInteger.ONE)){
            return BigInteger.TWO;
        }
        else{
            return ackermann(x.subtract(BigInteger.ONE),ackermann(x,y.subtract(BigInteger.ONE)));
        }
    }
   
    public static void main(String[] args) {
        System.out.println(ackermann(BigInteger.ONE,BigInteger.TEN));
        System.out.println(ackermann(BigInteger.TWO,BigInteger.valueOf(4)));
        System.out.println(ackermann(BigInteger.valueOf(3),BigInteger.valueOf(3)));
   }
}
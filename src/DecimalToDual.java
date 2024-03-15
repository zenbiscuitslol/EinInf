import java.util.Arrays;

public class DecimalToDual {
  public static String transformDual(int dec) {
    String binary = "";
    while (dec > 0) {
      int b = ((dec % 2));
      if (b == 0) {
        binary = "0" + binary;
      }
      else {
        binary = "1" + binary;
      }
      dec /= 2;
    }
    return binary;
  }


  public static void main(String[] args) {
    System.out.println(transformDual(13));
    System.out.println(transformDual(32));
    System.out.println(transformDual(22));
    System.out.println(transformDual(8));
    System.out.println(transformDual(248));
  }
}




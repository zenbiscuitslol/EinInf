import java.util.Arrays;
public class MedianOfThree {
  public static int median(int a, int b, int c) {
    int[] median= {a,b,c};
    Arrays.sort(median);
    return(median[1]);
  }
 public static int median2(int a, int b, int c) {
    if(a>b){
      if(b>c){
        return b;
      }
      if (a<c){
        return a;
      }
      else{
        return c;
      }
    }
    else{
      if(b<c){
        return b;
        }
      if (a>c){
        return a;
      }
      else{
        return c;
      }
    }
 }
 public static void main(String[] args) {
    System.out.println(median(123,1232154,5));
    System.out.println(median2(1,2,3));
    System.out.println(median(20,50,35));
    System.out.println(median2(500,150,65));
    System.out.println(median(25,11,33));
  }
}

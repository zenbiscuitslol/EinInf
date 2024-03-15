import java.util.Arrays;
public class RandomIntArray {
  public static int[] createRandom(int n) {
    int[] rand = new int [n];
    int a=0; //index of the array
    while(a<n){
      rand[a]= 5+(int)(95*Math.random());//range=max-min+1
      a=a+1;
    }
    return rand;
  }
  public static String toString(int[] a) {
    String stringa="";
    for(int i=0;i<a.length;i++){
      stringa = stringa + a[i]+" ";
    }
    return stringa;
  }
  public static int posMin(int[] a) {
    int min=a[0];
    int posmin=0;
    int len=a.length;
    for(int i=0;i<len;i++){
      if(min>a[i]){
        posmin=i;
        min=a[i];
      }
    }
    return posmin;
  }
  public static void swap(int[] a) {
    int temp= a[0];
    a[0]=a[a.length-1];
    a[a.length-1]=temp;
  }
  public static void main(String[] args){
    int[] a = createRandom(8);
    System.out.println("Mit toString() methode :"+toString(a));
    System.out.println("Mit Arrays.toString() :"+ Arrays.toString(a));
    System.out.println("Die kleinste Zahl steht im Index :" +posMin(a));
    swap(a);
    System.out.println("Mit Swap Methode :"+toString(a));
  }
}

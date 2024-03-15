//Gruppenarbeit mit Hannah Müller
public class TernarySearch {
  static final int UNDEF = -1;
  public static int countT=0; //variable for the times ternary method is called
  public static int compareT=0; // how many times did the ternary method compare
  public static int countF=0; //variable for the times find method is called
  public static int compareF=0; // how many times did the find method compares

  public static int find(int[] a, int x) {
    return _find(a, 0, a.length-1, x);
  }

  private static int _find(int[] a, int l, int r, int x) {
    countF++;
    if (l > r) return UNDEF; //returns -1 if left half is greter than right half
    int m = (l + r) / 2; //calculates middle point/index
    if (x == a[m]) {//returns the index of element if it is the middle index
      compareF++;
      return m;
    } else if (x < a[m]) {
      compareF++;
      return _find(a, l, m - 1, x); //searches left half
    } else {
      return _find(a, m + 1, r, x); //searches right half
    }
  }
  public static int ternaryRec ( int[] a, int x){
    return ternaryRec1(a, 0, a.length - 1, x);
  }

  private static int ternaryRec1 ( int[] a, int l, int r, int x){
    countT++;

    int byThree = (r - l) / 3; //divides the array into 3 parts
    int firstThird = l + byThree; // gets the 1/3rd index of array
    int secThird = firstThird+byThree; //gets the 2/3rd index of array

    if (l > r) {
      return UNDEF; //returns -1 when x can't be found
    }
    else if (x == a[firstThird]) {
      compareT++;
      return firstThird; //returns the index if x is the 1/3rd element
    }
    else if (x == a[secThird]) {
      compareT++;
      return secThird; //returns the index if x is the 2/3rd element
    }
    else if (x < a[firstThird]) {
      compareT++;
      return ternaryRec1(a, l, firstThird - 1, x); //searches for x in the first third of the array if x<1/3
    }
    else if (x > a[secThird]) {
      compareT++;
      return ternaryRec1(a, secThird + 1, r, x);//searches for x in the last third  of the array if x>2/3
    }
    else {
      compareT++;
      return ternaryRec1(a, firstThird, secThird , x); // searches for x in the second third of the array
    }
  }

    public static void main (String[]args){
      int[] a = {0,1,2,3,4,5,6,7,8,9};
      //int[] a = {9,6,8,7,2,5,1,3,0,4}; //doesn't work when order is changed ?
      int x =4;
      int ansF = find(a, x);
      int ansT = ternaryRec(a, x);
      System.out.println("Ternary :The element " + x + " is the element in index " + ansT);
      System.out.println("Ternary Method called " + countT + " times");
      System.out.println("Ternary Method compared " + compareT + " times");
      System.out.println("Find :The element " + x + " is the element in index " + ansF);
      System.out.println("Find Method called " + countF + " times");
      System.out.println("Find Method compared " + compareF + " times");
    }
}

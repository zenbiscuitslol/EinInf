import java.util.Arrays;

public class PerfectShuffle {
  public static int[] interleave(int[] a1, int[] a2) {
    int[] c = new int[a1.length + a2.length];//new list with length of a1 and a2
    int i = 0;
    int j = 0;
    while (i < c.length) {//adds elements of a1 first then a2 and repeats till all elements from a1 and a2 are added
      if (j < a1.length) {
        c[i] = a1[j];//adds element of a1 to c
        i++;
      }
      if (j < a2.length) {
        c[i] = a2[j]; //adds elements of a2 to c
        i++;
      }
      j++;
    }
    printinterleave(c);
    return c;
  }

  public static int[] perfectShuffle(int[] a) {
    if (a.length % 2 == 0) {
      int newlength = a.length / 2;
      int[] one = new int[newlength];
      int[] two = new int[newlength];
      for (int i = 0; i < one.length; i++) {//adds first half of a to array one
        one[i] = a[i];
      }
      for (int i = 0; i < two.length; i++) { // adds second half of a to array two
        two[i] = a[newlength];
        newlength++;
      }
      return interleave(one, two); //shuffles array one and array two
    }
    printinterleave(a);
    return a;
  }

  public static int shuffleNumber(int n) {
    int timesshuffled = 0;
    if (n % 2 == 0) {
      int[] numbers = new int[n];
      for (int i = 0; i < n; i++) {//adds all the numbers till n to array numbers
        numbers[i] = i;
      }
      int[] numbersshuffled = perfectShuffle(numbers);
      while (timesshuffled <= n) {
        // counts how many times the numbers were
        // shuffled till original order was returned
        numbersshuffled = perfectShuffle(numbersshuffled);
        timesshuffled++;

        for (int i = 0; i < numbers.length; i++) {
          if (numbers[i] == numbersshuffled[i]) {
            return timesshuffled;
          }
          else {
            return -1;
          }
        }
      }
      return -1;
    }
    return timesshuffled;
  }


  public static void main(String[] args) {
    int[] a1 = {1, 2, 3};
    int[] a2 = {4, 5, 6};
    int[] a = {1, 2, 3, 4, 5, 6, 7, 8};
    interleave(a1, a2);
    System.out.println("");
    //int[] out= perfectShuffle(a);
    //System.out.println(Arrays.toString(out));
    perfectShuffle(a);
    System.out.println("");
    shuffleNumber(52);
  }

  public static void printinterleave(int[] c) { //used to print an array
    //prints the array
    for (int i = 0; i < c.length; i++) {
      System.out.print(c[i] + " ");
    }
  }
}


/*********************************************************
 AUFGABE 1
 a = {5, 3, 4, 8, 7, 1, 2}
 ap =2 (pivot element), ai = element from left, aj = element from right
 ai>ap && aj<ap then ai<->aj
 when a[elementFromLeft] > a[elementFromRight], swap ap with elementFromLeft
 ai=5 aj=1 , ai>ap && aj<ap
 =>a = {1, 3, 4, 8, 7, 5, 2}
 swap 2 with 3, weil
 =>a = {1, 2, 4, 8, 7, 5, 3} (alle Elemente links von ap sind kleiner als ap und alle Elemente rechts von ap sind größer als ap)
 2 befindet sich an der sortierten Stelle
 der QuickSort-Algorithmus wird in der rechten Seite des Pivotelements(2) ausgeführt
 der rekursive Algorithmus wird fortgesetzt, bis wir a={1,2,3,4,5,7,8} erhalten

 AUFGABE 2
 Ja, die Wahl des Pivot-Elements beeinflusst die Vergleiche
 z.B a={2,3,4,5,6,7,8,9,1} mit dem Pivotelemet als 1
**********************************************************/
package QuickSort;
public class QuickSort {
    public static <T extends Comparable<T>> void quickSort(T[] a) {
        quickSortRec(a,0,a.length-1);
    }

    public static <T extends Comparable<T>> void quickSortRec(T[] a, int l, int r) {
        if(l<r) {
            int pivot = getPivot(a, l, r); //gets the pivot element and it's index
            quickSortRec(a, l, pivot - 1); //sorts the elements on the left side of the pivot element
            quickSortRec(a, pivot + 1, r); //sorts the elements on the right side of the pivot element
        }
    }

    public static <T extends Comparable<T>> int getPivot(T[] a, int l, int r) {
        T pivot = a[r];//chooses the right most element as the pivot element
        int i= l-1;
        int j= l;
        while(j<r) { //loop goes on till j is the index before the pivot
            if (a[j].compareTo(pivot)<=0) { //all elements smaller than pivot will be on the left and greater than pivot will be on the right
               //.compareTo returns 0 if value is same, -1 if 1st obj is smaller, 1 if 1st obj is greater
                i++;
                T temp = a[i]; //swaps a[i] with a[j]
                a[i] =a[j];
                a[j] = temp;
            }
            j++;
        }
        i++;
        T temp = a[i];//swaps pivot with ai when ai>aj
        a[i]=a[r];
        a[r]=temp;

        return i; //index of the pivot element
    }

}
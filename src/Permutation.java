public class Permutation {

    public static void findperm(int[]p, int index){//index used to iterate through the elements

        if(index==p.length-1){ //breaks the recursion when all elements have been swapped
            printperm(p);
            return;
        }
        for(int i=index;i<p.length;i++){
            swap(p,i,index); //swaps the values with i and the next index value
            findperm(p,index+1);
            swap(p,i,index);
        }
    }
    public static void printperm(int[]p){
        //prints the array
        System.out.println(" ");
        for(int i=0;i<p.length;i++){
            System.out.print(p[i]+" ");
        }
    }
    public static void swap(int[] p, int a, int b){
        //used to swap the elements of the array
        int temp=p[a];
        p[a]=p[b];
        p[b]=temp;
    }
    public static void main(String[] args){
        int[]p = {1,2,3};
        findperm(p, 0);//index = 0 to start with first element
    }
}

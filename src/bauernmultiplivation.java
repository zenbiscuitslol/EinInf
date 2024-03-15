public class bauernmultiplivation {
    public static int famerMultIter(int x, int y){
        int product=0;
        while(x>0){
            if(x%2!=0){
                product+=y;
            }
            x/=2;
            y*=2;
        }
        return product;
    }
    public static int famerMultRec(int x, int y){
        if(x==1){
            return y;
        }
        else if (x%2!=0) {
            return famerMultRec(x/2,y*2);
        }
        return famerMultIter(x/2,y*2);
    }
    public static void main(String args[]){
        //System.out.println(famerMultIter(150,3));
        System.out.println(famerMultRec(200,200));
    }
}

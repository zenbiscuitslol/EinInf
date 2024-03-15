public class HappyNumbers {
    public static boolean isHappy(int n) {
        int end= n;
        while(end !=1 && end!=4){
            end=ifhappy(end);
        }
        if(end == 1){
            return true;
        }
        else {
            return false;
        }
    }
    public static int ifhappy(int n){
        int temp=0;
        int check=0;
        while(n>0){
            temp = n%10;
            check = check+(temp*temp);
            n = n/10;
        }
        return check;
    }
    public static int nextHappyNumber(int n) {
        int nexthappy = n;
        while (true){
            if(isHappy(nexthappy)){
                return nexthappy;
            }
            else{
                nexthappy = nexthappy+1;
            }
        }
    }
    public static void main(String[] args) {
        System.out.println(HappyNumbers.isHappy(100));
        System.out.println(HappyNumbers.isHappy(103));
        System.out.println(HappyNumbers.isHappy(50));
        System.out.println(HappyNumbers.isHappy(19));
        System.out.println(HappyNumbers.isHappy(79));
        System.out.println(HappyNumbers.isHappy(89));
        System.out.println(HappyNumbers.nextHappyNumber(3));
    }
}
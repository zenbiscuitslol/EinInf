public class PrimeTwins {
//---------------------------------------------------------------------------//
  public static int[][] primeTwins(int amount) {
    int[][] primetwins=new int[amount][2];
    int coloumn = 0;//spalte der 2d matrix
    int check=2;//first prime is 2
    //für eine zufällige Anzahl von Primzahlen kann check eine Zufallszahl sein
    // int check=random.nextInt(Max-2)+2
    //max ist die höchste gesuchte Zufallszahl
    while(coloumn<amount){
      if(checkprime(check)&&checkprime(check+2)){
        primetwins[coloumn][0]=check;
        primetwins[coloumn][1]=check+2;
        coloumn+=1;
      }
      check++;// wir brauchen kein check++ für eine zufällige Anzahl von Primzahlen
    }
    printprime(primetwins);
    return primetwins;
  }
  public static void main(String[] args) {
    primeTwins(3);
  }
  //---------------------------------------------------------------------------//
  public static boolean checkprime(int num){
    if(num<=1){
      return false;
    }
    if(num==2 || num==3 || num==5){
      return true;
    }
    if(num%2==0 || num%3==0 || num%5==0){
      return false;
    }
    for(int i=2;i<=num/2;i++){
      if((num%i)==0){
        return false;
      }
    }
    return true;
  }
  public static void printprime(int[][] array){
    for(int i=0;i<array.length;i++){
      System.out.println(array[i][0]+","+array[i][1]);
    }
  }
}




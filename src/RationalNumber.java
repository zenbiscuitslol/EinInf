public class RationalNumber implements Comparable<RationalNumber>{
//---------------------------------------------------------------------------//
  private int num = 0;
  private int denom = 1;
//---------------------------------------------------------------------------//
  public RationalNumber() {}
  public RationalNumber(int n, int d) {
    // TODO: if (d == 0) ...
    // TODO: source code
    // only the numerator contains negative sign (if is necessary)
    // reducing or simplifying the fraction
    if (d == 0) {
      throw new IllegalArgumentException("Denominator cant be zero.");
    }
    // reduce the fraction
    int gcd = findGCD(Math.abs(n), Math.abs(d));
    this.num = n / gcd* (d < 0 ? -1 : 1); //makes nume -ve if denom is -ve
    this.denom = Math.abs(d) / gcd;
  }
  private int findGCD(int a, int b) { //used to find gcd to reduce the fraction
    while (b != 0) {
      int temp = b;
      b = a % b;
      a = temp;
    }
    return a;
  }
//---------------------------------------------------------------------------//
  public int getNum() {
    // TODO: return
    return this.num;
  }
//---------------------------------------------------------------------------//
  public int getDenom() {
    // TODO: return
    return this.denom;
  }
//---------------------------------------------------------------------------//
  public int compareTo(RationalNumber n){
    // TODO: source code
    int compare1 = this.getNum()/this.getDenom();
    int compare2= n.getNum()/n.getDenom();
    return Integer.compare(compare1,compare2);
  }
//---------------------------------------------------------------------------//
  public RationalNumber add(RationalNumber r) {
    // TODO: source code
    // returns a ***new*** RatNumber
    // (a/b)+(x/y) =(a*y)+(x*b)/b*y
    int addNum = this.getNum()*r.getDenom() + r.getNum()*this.getDenom();
    int addDenom= this.getDenom()*r.getDenom();
    return new RationalNumber(addNum,addDenom);
  }
//---------------------------------------------------------------------------//
  public RationalNumber div(RationalNumber r) {
    // TODO: source code
    // returns a ***new*** RatNumber
    // (a/b)/(x/y) = a*y/b*x
    int divNum = this.getNum() * r.getDenom();
    int divDenom = this.getDenom() * r.getNum();
    return new RationalNumber(divNum, divDenom);
  }
//---------------------------------------------------------------------------//
  public String toString() {
    // TODO: put num and denom in a "nice" String
    return this.getNum()+"/"+this.getDenom();
  }
//---------------------------------------------------------------------------//
  public static void main(String[] args) {
    // TODO: test data
    RationalNumber rnum1= new RationalNumber(1,4);
    RationalNumber rnum2= new RationalNumber(2,5);
    RationalNumber sum= rnum1.add(rnum2);
    RationalNumber div= rnum1.div(rnum2);
    System.out.println("sum :"+sum);
    System.out.println("div :"+div);
  }
}

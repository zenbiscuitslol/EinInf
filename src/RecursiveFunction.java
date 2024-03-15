package b033.RecurcisveFunction.templates;
/**************************************
z.B
 f(7,3)
 f(6,2)
 f(5,1)
 4
 diese Funktion berechnet die x achsenabschnitt der Funktion

die Algorithmus terminiert nicht wenn y -ve ist
 zB f(7,-1)
 f(6.-2)
 f(5,-3)
 f(4,-4)
 und die funktion terminiert nicht weil y<0 ist.
***********************************************/
public class RecursiveFunction {
    public static int rec(int x, int y) {
        int xaxis=0;
        if (y == 0) {
            return x;
        }
        if (y > 0) {
            printrec(x, y);
            xaxis=rec(x-1,y-1);
        }
        if(y < 0) {
            printrec(x, y);
            xaxis=rec(x + 1, y + 1);
        }
        return xaxis;
    }
    public static int iter(int x, int y) {
        if(y==0){
            return x;
        }
        if (y>0) {
            while (y > 0) {
                printrec(x, y);
                y = y - 1;
                x = x - 1;
            }
        }
        if (y<0) {
            while (y < 0) {
                printrec(x, y);
                x = x + 1;
                y = y + 1;
            }
        }
        return x;
    }
    public static void main (String[]args){
        System.out.println("Recursion:-");
        System.out.println(rec(4, 5));
        System.out.println("Iteration:-");
        System.out.println(iter(4,5));
        System.out.println("Recursion:-");
        System.out.println(rec(6, -3));
        System.out.println("Iteration:-");
        System.out.println(iter(6,-3));
        }
    private static void printrec(int x, int y){
        System.out.println("f("+x+","+y+")");
    }
}

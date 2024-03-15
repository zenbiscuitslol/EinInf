/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("What is your name? :");
        String name = scanner.nextLine();

        System.out.println("How old are you? :");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("What is your fav food? :");
        String food = scanner.nextLine();

        System.out.println("hello "+ name);
        System.out.println("you are "+age+" years old");
        System.out.println("fav food is "+food );





    }
}







import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side a: ");
        double a = scanner.nextDouble();

        System.out.println("Enter side b: ");
        double b = scanner.nextDouble();

        double c = Math.sqrt(a*a + b*b);
        System.out.println("the hypotenuse is:" + c);

        scanner.close();
    }
}





public class Main {
    public static double cube(double V){
        V=64.0;
        double a,b,c;
        a=b = 1.0;
        c = V;
        while (Math.abs(V - (a * b * c)) > 0.1) {
            a = (a + b + c)/ 3;
            b = a;
            c = V/2(a+b+c/3);
        }
        return a,b,c;
    }

 */
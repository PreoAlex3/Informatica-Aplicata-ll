import java.util.Scanner;

public class Main {
    static void Division(double x)
    {
        double b;
        try {
            b = 10/x;
        } catch (ArithmeticException e) {
            System.out.println("Impartire prin 0. b=0");
            b = 0;
            e.printStackTrace();
        }
        catch (Exception e) {
            b = -1;
            System.out.println("Eroare generala");
            e.printStackTrace();
        }
        System.out.print("b="+b);
    }
    public static void main(String[] args) {
        double x = 0;
        Scanner scan = new Scanner(System.in);
        x= scan.nextDouble();
        Division(x);
    }
}
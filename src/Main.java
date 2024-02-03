import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a, b, c, x;
        var input = new Scanner(System.in);

        System.out.println("Введите a,b,c,x через пробел:");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        x = input.nextDouble();

        System.out.println(Calculate(a, b, c, x));
    }

    private static double Calculate(double a, double b, double c, double x) {
        double result;

        result = Math.sqrt(
                (a * Math.pow(x, 3) + Math.atan(x)) / (c * x + b * Math.abs(Math.log(x)))
        );

        return result;
    }
}
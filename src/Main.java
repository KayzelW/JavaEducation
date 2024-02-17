import java.util.Scanner;

public class Main {
    //Var 10


    public static void main(String[] args) {
        var scanner = new Scanner(System.in);


//        double y = calculate(scanner.nextDouble()); //Task 1
//        System.out.println("y = " + y); //Task 1
        int y = calcFor(scanner.nextDouble(), scanner.nextInt()); //Task 2
        System.out.printf("Функция выполнила %d итераций\n", y); //Task 2
    }


    public static int calcFor(double x, int rows) {
        int n = 1;
        double sum = 0;
        for (; n <= rows; n++) {
            var temp = scaleByN(n) * Math.pow(x, n);
            System.out.printf("Значение на этапе %d = %e\n", n, temp);
            sum += temp;
        }
        System.out.printf("Общая сумма = %e\n", sum);
        return n-1;
    }

    private static double scaleByN(int n) {
        double subBracket = 0;
        for (int i = 1; i <= n; i++) {
            subBracket += 1.0 / i;
        }
        return Math.pow(-1, n - 1) * subBracket;
    }

    public static double calculate(double x) {
        final double A = 1.0;
        final double B = 2.0;
        if (x <= 0) {
            return Math.sqrt(Math.exp(2 * x - B)) - 1;
        } else {
            return 1 / (Math.pow(x, 2) + A);
        }
    }
}
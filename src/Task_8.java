import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOne = Integer.parseInt(scanner.next());
        int numTwo = Integer.parseInt(scanner.next());
        result(numOne,numTwo);
    }

    public static void result(int numOne, int numTwo) {
        if(numOne > 0 && numTwo > 0) {
            long fact1 = factorial(numOne);
            long fact2 = factorial(numTwo);
            double division = fact1 * 1.0 / fact2;
            System.out.printf("%.2f", division);
        }
        else
            System.out.println(0);
    }

    public static long factorial(int number) {
        long result = 1;
        for (int i = number; i > 0; i--) {
            result *= i;
        }
        return result;
    }
}

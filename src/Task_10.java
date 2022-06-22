import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.next());
        printTopNumbers(number);
    }

    public static void printTopNumbers(int number){
        for (int i = 0; i < number; i++) {
            if(isDivisibleByEight(i) && hasOddDigit(i))
                System.out.println(i);
        }
    }

    public static boolean isDivisibleByEight(int number){
        int total = 0;
        for (int i = number; i > 0;i /= 10){
            total += i % 10;

        }
        return total % 8 == 0;
    }

    public static boolean hasOddDigit(int number){
        for (int i = number; i > 0; i /= 10) {
            if((i % 10) % 2 != 0) {
                return true;
            }
        }
        return false;
    }
}

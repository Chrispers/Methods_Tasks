import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOne = Integer.parseInt(scanner.next());
        int numTwo = Integer.parseInt(scanner.next());
        int numThree = Integer.parseInt(scanner.next());
        System.out.println(subtract(sum(numOne,numTwo), numThree));
    }
    public static int sum(int numOne, int numTwo){
        return numOne + numTwo;
    }
    public static int subtract(int sum, int numThree){
        return sum - numThree;
    }
}

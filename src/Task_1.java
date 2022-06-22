import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOne = scanner.nextInt();
        int numTwo = scanner.nextInt();
        int numThree = scanner.nextInt();
        findSmallestNumber(numOne,numTwo,numThree);
    }

    public static void findSmallestNumber(int numOne, int numTwo, int numThree){
        int temp = numOne;
        if(temp > numTwo) temp = numTwo;
        if(temp > numThree) temp = numThree;
        System.out.println(temp);
    }
}

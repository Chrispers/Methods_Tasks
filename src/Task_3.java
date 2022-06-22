import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char charOne = scanner.next().charAt(0);
        char charTwo = scanner.next().charAt(0);
        findInbetween(charOne,charTwo);
    }
    public static void findInbetween(char charOne, char charTwo){
        if((int) charTwo > (int) charOne) {
            for (int i = (int) charOne + 1; i < (int) charTwo; i++) {
                System.out.print((char) i + " ");
            }
        }else{
            for (int i = (int) charTwo + 1; i < (int) charOne; i++) {
                System.out.print((char) i + " ");
            }
        }
    }
}


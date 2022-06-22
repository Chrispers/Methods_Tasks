import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = "";
        while(true){
            command = scanner.next();
            if(command.equals("END"))
                break;
            System.out.println(isPalindrom(command));
        }
    }
    public static boolean isPalindrom(String number){
        StringBuilder numTwo = new StringBuilder();
        for (int i = number.length() - 1; i >= 0 ; i--) {
            numTwo.append(number.charAt(i));
        }
        for (int i = 0; i < number.length(); i++) {
            if(!(number.charAt(i) == numTwo.charAt(i))){
                return false;
            }
        }
        return true;
    }
}

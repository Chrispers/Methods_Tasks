import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        checkPassword(password);
    }
    public static void checkPassword(String password){
        int isTrue = 0;
        if(requirementOne(password))
            isTrue++;
        if(requirementTwo(password))
            isTrue++;
        if(requirementThree(password))
            isTrue++;
        if(isTrue == 3)
            System.out.println("Password is valid");
    }

    public static boolean requirementOne(String password){
        if(password.length() < 6 || password.length() > 10) {
            System.out.println("Password must be between 6 and 10 characters");
            return false;
        }
        return true;
    }

    public static boolean requirementTwo(String password){
        for (int i = 0; i < password.length(); i++) {
            char character = password.charAt(i);
            if(!((int) character > 47 && (int) character < 58) &&
            !((int) character > 64 && (int) character < 91) &&
            !((int) character > 96 && (int) character < 123)) {
                System.out.println("Password must consist only of letters and digits");
                return false;
            }
        }
        return true;
    }
    public static boolean requirementThree(String password){
        int counter = 0;
        for (int i = 0; i < password.length(); i++) {
            char character = password.charAt(i);
            if((int) character > 47 && (int) character < 58)
                counter++;
        }
        if(counter < 2) {
            System.out.println("Password must have at least 2 digits");
            return false;
        }
        return true;
    }
}

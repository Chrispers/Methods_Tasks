import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        if(text.length() % 2 == 0)
            middleCharacters(text);
        else
            middleCharacter(text);
    }

    public static void middleCharacter(String text){
        System.out.println(text.charAt(text.length() / 2));
    }
    public static void middleCharacters(String text){
        System.out.print(text.charAt((text.length() / 2) - 1));
        System.out.print(text.charAt(text.length() / 2));
    }
}

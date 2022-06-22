import java.util.Locale;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        findVowelsNumber(text);
    }

    public static void findVowelsNumber(String text) {
        int counter = 0;
        text = text.toLowerCase(Locale.ROOT);
        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i) == 'i' || text.charAt(i) == 'a' || text.charAt(i) == 'e' ||
            text.charAt(i) == 'u' || text.charAt(i) == 'y' || text.charAt(i) == 'o'){
                counter++;
            }
        }
        System.out.println(counter);
    }
}

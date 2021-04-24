import java.util.*;

public class PangramCheck{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sentence = sc.nextLine();
        sentence = sentence.toLowerCase();
        for (char i = 'a'; i <= 'z'; i++) {
            for (int j = 0; j < sentence.length(); j++) {
                if (i == sentence.charAt(j)) {
                    break;
                } else {
                    System.out.println("Bukan Pangram");
                    return;
                }
            }
        }

        System.out.println("Pangram");
    }
}
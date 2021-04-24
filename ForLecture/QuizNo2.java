import java.util.Scanner;

public class QuizNo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        String sentence = sc.nextLine();

        String newSentence = "";

        for (int i = sentence.length() - 1; i >= 0; i--) {
            newSentence += sentence.charAt(i);
        }

        System.out.println(newSentence);
    }
}
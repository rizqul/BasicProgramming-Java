import java.util.*;

public class ABWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int inTimes = sc.nextInt();

        String word[] = new String[inTimes];
        for (int i = 0; i < inTimes; i++) {
            word[i] = sc.next();
        }

        for(int i = 0; i < word.length; i++){
            System.out.println(alternatingCharacters(word[i]));
        }
    }

    static int alternatingCharacters(String sample) {

        int save = 0;
        for (int i = 0; i < sample.length() - 1; i++) {
            if (sample.charAt(i) == sample.charAt(i + 1)) {
                save++;
            }
        }

        return save;
    }
}
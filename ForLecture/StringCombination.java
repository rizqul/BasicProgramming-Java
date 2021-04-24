import java.util.*;

public class StringCombination{

    static List<Integer> sameChar = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next();
        word = word.toLowerCase();

        int b = factorial(word.length());

        int c = 1;
        for (int i = 0; i < sameChar.size(); i++) {
            c *= factorial(sameChar.get(i));
        }

        int hasil = (double) b / (double) c;
        System.out.println(hasil);
    }

    static List<Integer> checkSameValue(String sample) {
        char[] newSample = sample.toCharArray();
        Arrays.sort(newSample);
        
        int save = 1;
        for (int i = 0; i < sample.length() - 1; i++) {
            System.out.print(newSample[i]);
            if (newSample[i] == newSample[i + 1]) {
                save++;
            } else {
                sameChar.add(save);
                save = 1;
            }
        }
        sameChar.add(save);
        return sameChar;
    }

    static int factorial(int a){
        int b = a;
        for (int i = a - 1; i >= 1; i--) {
            b *= i;
        }

        return b;
    }
}
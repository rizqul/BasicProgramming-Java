import java.util.*;

public class AlphabetValue2 {

    static List<Integer> number = new ArrayList<>();
    static Set<Character> alphabet = new HashSet<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();

        char[] tes = new char[alphabet.size()];

        for (int i = 0; i < tes.length; i++) {
            tes[i] = alphabet.get(i);
        }

        Arrays.sort(tes);

        System.out.println(tes);
        System.out.println(wordFormat(word));
        System.out.println(sameCharValue(wordFormat(word)));
        for (int i = 0; i < tes.length; i++) {
            System.out.print(tes[i]);
        }
    }

    static String wordFormat(String a) {

        a = a.replace(" ", "");
        char[] word = a.toCharArray();
        Arrays.sort(word);

        String b = String.valueOf(word);

        return b;
    }

    static List<Integer> sameCharValue(String a) {

        int save = 1;
        for (int i = 0; i < a.length() - 1; i++) {
            if (a.charAt(i) == a.charAt(i + 1)) {
                save++;
            } else {
                number.add(save);
                save = 1;
            }
        }
        number.add(save);

        return number;
    }

    static Set<Character> sameChar(String a) {

        for (int i = 0; i < a.length(); i++) {
            alphabet.add(a.charAt(i));
        }

        return alphabet;
    }

}
import java.util.*;

public class AlphabetValue {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        word = word.replaceAll(" ", "");

        char[] newWord = word.toCharArray();
        Arrays.sort(newWord);

        for (int i = 0; i < newWord.length; i++) {
            System.out.print(newWord[i]);
        }

        HashMap<Character , Integer> charNumber = new HashMap<>();

        for (int i = 0; i < newWord.length; i++) {
            int save = 1;
            boolean check = false;
            for (int j = i + 1; j < newWord.length; j++) {
                if(newWord[i] == newWord[j]){
                    check = true;
                    save++;
                } else {
                    charNumber.put(newWord[i],save);
                    i=j - 1;
                    break;
                }
            }
            if (check ) {
                charNumber.put(newWord[i], save);
            }
        }

        List<Character> alphabet = new ArrayList<>();

        for (int i = 0; i < newWord.length - 1; i++) {
            if(newWord[i] != newWord[i + 1] || i == newWord.length - 2){
                alphabet.add(newWord[i]);
            }
        }

        for (int j = 0; j < alphabet.size(); j++) {
            System.out.println(alphabet.get(j));
        }

        System.out.println("map size"+charNumber.size());
  
        for (int i = 0; i < alphabet.size(); i++) {
            System.out.println(charNumber.get(alphabet.get(i)));
        }
    }
}
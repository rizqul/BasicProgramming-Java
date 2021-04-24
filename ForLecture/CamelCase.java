import java.util.*;

public class CamelCase {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String wordEx = sc.next();

        int save = 1;
        for (int i = 0; i < wordEx.length(); i++) {
            if (wordEx.charAt(i) >= 'A' && wordEx.charAt(i) <= 'Z') {
                save++;
            }
        }

        System.out.println(save);
    }
}
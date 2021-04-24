import java.util.HashMap;
import java.util.Scanner;

public class Materi_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<String, Integer> days = new HashMap<>();
        days.put("senin", 1);
        days.put("selasa", 2);
        days.put("rabu", 3);

        days.forEach((k, v) -> {
            System.out.println(k);
        }
        );

        String s = sc.next();

        System.out.println(days.get(s));
    }
}
import java.util.*;

public class InfinitySum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String number1 = sc.next();
        String number2 = sc.next();

        if (number1.length() > number2.length()) {
            number2 = String.format("%"+number1.length()+"s", number2);
            number2 = number2.replaceAll(" ", "0");
        } else {
            number1 = String.format("%"+number2.length()+"s", number1);
            number1 = number1.replaceAll(" ", "0");
        }

        String result = "";
        int save = 0;
        for (int i = number1.length() - 1; i >= 0; i--) {
            int digit1 = (int) number1.charAt(i) - 48;
            int digit2 = (int) number2.charAt(i) - 48;
            int sum = save + digit1 + digit2;
            result += String.valueOf(sum % 10);
            save = sum / 10;
        }
        result += String.valueOf(save);

        String answer = "";
        for (int i = result.length() - 1; i >= 0; i--) {
            answer += result.charAt(i);
        }

        System.out.println(answer);


    }
}
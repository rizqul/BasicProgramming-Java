import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.HashMap;

public class Test_36 {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        HashSet<String> nama = new HashSet<>();
        ArrayList<String>delete;
        name.add("zqull");
        name.add("Smunel");
        name.add("best");

        String [] arr = {"zqull","Smunel"};
        delete = new ArrayList<>(Arrays.asList(arr));

        for (int i = 0; i < name.size(); i++) {
            System.out.println(name.get(i));
        }


    }
}
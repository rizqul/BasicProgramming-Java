import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Materi_10{
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();

        name.add("zqull");
        name.add("riss");
        name.add("Cool");
        name.add("saya");
        name.add("-_-");

        // for (int i = name.size()-1; i >=0; i--) {
        //     System.out.println(name.get(i));
        // }

        //Collection.reverse(name);

        // name.forEach(System.out::println);

        // Iterator itr = name.iterator();

        // while (name.iterator().hasNext()) {
        //     System.out.println(name.iterator().next());
        // }

        Collections.sort(name);
        name.forEach(System.out::println);
    }
}
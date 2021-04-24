import java.util.Arrays;

public class Test_25{
    public static void main (String[] args){
        int [] a = {1,2,3,4};
        int [] b = {1,2,3,4};

        boolean truth1 = a == b ;
        boolean truth2 = Arrays.toString(a) == Arrays.toString(b);
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(truth1);
        System.out.println(truth2);
        
    }
}
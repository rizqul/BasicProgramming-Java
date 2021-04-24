public class Test_6 {

    public static void main(String[] args){
        int x = 2;
        int y = 64;
        boolean truth1 = x % y == 0;
        boolean truth2 = y % x == 0;
        boolean rightTruth = truth1 || truth2 ;
        System.out.println(rightTruth);
    }
}
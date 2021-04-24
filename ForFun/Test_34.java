public class Test_34 {
    public static void main(String[] args) {
        String am = "qwerty";
        String bm = "wasd";

        String dm = am.substring(4);
        String cm = bm.concat(am);

        System.out.println(dm);
        System.out.println(cm);
    }
}
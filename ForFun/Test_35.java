public class Test_35 {
    public static void main(String[] args) {
        String a1 = "a" + "b";
        System.out.println(a1);
        a1 += "c";
        System.out.println(a1);
        String a2 = "abc";
        String a3 = "abc";

        if(a3 == a2){
            System.out.println("sama");
        } else {
            System.out.println("ndak sama");
        }

    }
}
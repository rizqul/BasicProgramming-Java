public class Test_28 {

    public static void main(String[] args) {
        int s = 11;
        int luas = luasKubus(s);
        int qwe = tes(s);
        System.out.println(qwe);

        System.out.println(luas);
    }

    //tes tes
    static int tes (int abc){
        int c = abc - 3;
        return c;
    }

    // membuat fungsi luasPersegi()
    static int luasPersegi(int sisi){
        return sisi * sisi;
    }

    // membuat fungsi luasKubus()
    static int luasKubus(int sisi){
        
        // memanggil fungsi luasPersegi
        return 6 * luasPersegi(sisi);
    }

}
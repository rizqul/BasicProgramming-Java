import java.util.Scanner;

public class Test_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama1 = null, nama2 = null, nama3 = null;
        int skor1 = 0,skor2 = 0, skor3 = 0;

        int banyak = sc.nextInt();

        if(banyak >=3){
            for (int i = 0; i < banyak;i++) {
                String kandidat = sc.next();
                int kandidatSkor = sc.nextInt();

                if (nama1 == null){
                    nama1 = kandidat;
                    skor1 = kandidatSkor;
                }else if (nama2 == null){

                    if (kandidatSkor > skor1){
                        nama2 = nama1;
                        skor2 = skor1;
                        nama1 =  kandidat;
                        skor1 = kandidatSkor;
                    }else{
                        nama2 = kandidat;
                        skor2 = kandidatSkor;
                    }
                }else if(nama3 == null){
                    if (kandidatSkor > skor1){
                        nama3 = nama2;
                        skor3 =skor2;
                        nama2 = nama1;
                        skor2 = skor1;
                        nama1 = kandidat;
                        skor1 = kandidatSkor;
                    }else if (kandidatSkor > skor2){
                        nama3 = nama2;
                        skor3 =skor2;
                        nama2 = kandidat;
                        skor2 = kandidatSkor;
                    }else{
                        nama3 = kandidat;
                        skor3 = kandidatSkor;

                    }
                } else {
                    if (kandidatSkor > skor1){}
                }

            }
        }else {
                System.out.println("error");
         }
        }
    }



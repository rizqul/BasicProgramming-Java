import java.util.Scanner;

public class TugasKelas_6{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int password;
        int correctpassword = 2002;
        do{
              password = input.nextInt();
            if(password != correctpassword){
                System.out.println("passwor salah");
            } else{
                System.out.println("password benar");
            }
        }while(password != correctpassword);
    }
}
import java.util.Scanner;

class Quiz_b{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int limit = sc.nextInt();
        int lostNumber = 0;
        int i;

        for (i = 1; i <= limit; i++){
            int member = sc.nextInt();
            if (member != i){
                lostNumber = i;
                i = member;
                limit++;   
            } 
            i = member;
        }
        System.out.println("Angka Yang Hilang = "+lostNumber);
    }
}
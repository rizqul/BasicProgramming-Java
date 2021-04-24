import java.util.Scanner;
import java.io.FileWriter;

public class DollarCount{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = sc.nextDouble();
        double[] value = {100,50,20,10,5,1,0.50,0.25,0.10,0.05,0.01};
        int[] number = new int[value.length];

        FileWriter out = null;    
    try {
        String name = sc.next();
        out = new FileWriter(name + ".txt");

        out.write("Total uang = " + total + "\n\n");
        int save = (int)total;
        double save2 = total - save;
        for (int i = 0; i < 6; i++) {
            if (save != 0) {
                number[i] = save / (int)value[i];
            save = save % (int)value[i];
            out.write("Uang " + (int)value[i] + " = " + number[i] + " lembar\n");
            }
        }
        save2 *= 100;
        for (int i = 6; i < number.length; i++) {
            number[i] = (int)save2 / (int)(value[i] * 100);
            save2 = (int)save2 % (int)(value[i] * 100);
            out.write("Uang " + value[i] + " = " + number[i] + " lembar\n");
        }
        
    } catch (Exception e) {
        System.out.println(e.getMessage());
    } finally {
        try {
            if(out != null){
                out.close();
                System.out.println("berhasil");
            }
        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }
    }
}
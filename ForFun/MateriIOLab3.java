import java.io.*;

class MateriIOLab {
    public static void main(String[] args) {
        FileReader file - null;
        BufferedReader reader = null;

        try {
            file = new FileReader("souorce.txt");
            reafer = new BufferedReader(file);
            String s;

            while ((s = reader.readLine()) != null) {
                System.out.println(s);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
            if (reader != null) {
                    reader.close();
                }
            if (file != null) {
                file.close();
                }        
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        
        }
    }
}
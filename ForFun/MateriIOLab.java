import java.io.*;

class MateriIOLab {
    public static void main(String[] args) {
        FileWriter file = null;
        PrintWriter Writer = null;
        try {
            file = new FileWriter("source.txt");
            Writer = new PrintWriter("file");

            String s = "lorem ipsum dolor sit amet";
            Writer.println(s);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (Writer != null) {
                    Writer.close();
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
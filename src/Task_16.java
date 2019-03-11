import java.io.*;

public class Task_16 {
    public static void main(String[] args) {
        try(FileInputStream fin = new FileInputStream("/Users/helenlip/IdeaProjects/untitled2/file.in"))
        {
            byte[] buffer = new byte[fin.available()];
            fin.read(buffer, 0, buffer.length);
            String s = new String(buffer);
            System.out.print(s);
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Task_18 {
    public static void main(String[] args) {
        String s;
        try (FileInputStream fin = new FileInputStream("/Users/helenlip/IdeaProjects/untitled2/file.in")) {
            byte[] buffer = new byte[fin.available()];
            fin.read(buffer, 0, buffer.length);
            s = new String(buffer);
            System.out.println(s);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            return;
        }

        int n = s.split("\n").length;
        Scanner in = new Scanner(System.in);

        try (FileOutputStream fos = new FileOutputStream("/Users/helenlip/IdeaProjects/untitled2/file.in")) {
            for (int i = 0; i < n; ++i) {
                String text = in.nextLine() + "\r\n";
                byte[] buffer = text.getBytes();
                fos.write(buffer, 0, buffer.length);
            }
        } catch (IOException ex){
            System.out.println(ex.getMessage());
            return;
        }
    }
}

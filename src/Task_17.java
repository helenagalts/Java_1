import java.io.*;
import java.io.FileOutputStream;

public class Task_17
{

    public static void main(String[] args)
    {
        String s;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Признак конца ввода - строка 'stop' ");

        try (FileWriter fw = new FileWriter("/Users/helenlip/IdeaProjects/untitled2/file.in"))
        {
            do {
                System.out.print(": ");
                s = br.readLine();

                if (s.compareTo("stop") == 0) break;
                s = s + "\r\n";
                fw.write(s);
                }
            while(s.compareTo("stop")!= 0);
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
            }
    }

}

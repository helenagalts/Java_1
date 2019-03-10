import java.util.Scanner;

public class Task_12 {
    public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    System.out.println("Введите строку:");
    String str = in.nextLine();
    String str_2 = str.replaceAll("\\s", "");
    System.out.println("Строка без пробелов: " + str_2);


    }

}

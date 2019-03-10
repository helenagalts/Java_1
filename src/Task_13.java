import java.util.Scanner;

public class Task_13 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите первую строку:");
        String str_1 = in.nextLine();
        System.out.println("Введите вторую строку:");
        String str_2 = in.nextLine();
            if (str_1.length() > str_2.length())
            {
                System.out.println("Больше символов в строке: " + str_1);
            }
            else
            {
                System.out.println("Больше символов в строке: " + str_2);
            }


    }
}

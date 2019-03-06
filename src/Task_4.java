import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число в бинарном формате:");
        String res = in.next();
        int res_2 = Integer.parseInt(res,2);
        System.out.println("Введенное число в формате int = " + res_2);

    }
}

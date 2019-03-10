import java.util.Scanner;

public class Task_14 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");
        String S = in.nextLine();
        int X = Integer.parseInt(S);
        double Y = (double) X;
        System.out.println("Результат: \n" + S + "\n" + X + "\n" + Y);
    }
}
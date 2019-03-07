import java.util.Scanner;

public class Task_7 {

    public static void main(String[] args) {
        int x = 3;
        int y = 7;
        int я = 1;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите T");
        int T = in.nextInt();
        switch (T) {
            case 3:
            case 7:
            case 1:
                System.out.println("Данное значение имеется в константах");
                break;
            default:
                System.out.println("Такой константы нет!");
        }
    }
}

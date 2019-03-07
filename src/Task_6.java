import java.util.Scanner;

public class Task_6 {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите X");
        int x = in.nextInt();
        System.out.println("Введите Y");
        int y = in.nextInt();
        System.out.println("Введите Z");
        int z = in.nextInt();
        int av = (x + y + z)/ 3;
        int rez = av / 2;

        if (rez > 3)
            System.out.println("Программа выполнена корректно");
    }
}
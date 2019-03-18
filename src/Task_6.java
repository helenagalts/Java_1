import java.util.Scanner;

public class Task_6 {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите X");
        double x = in.nextDouble();
        System.out.println("Введите Y");
        double y = in.nextDouble();
        System.out.println("Введите Z");
        double z = in.nextDouble();
        double av = (x + y + z)/ 3;
        double rez = Math.floor(av / 2);
        

        if (rez > 3)
            System.out.println("Программа выполнена корректно");
    }
}
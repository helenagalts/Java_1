import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            System.out.println("Введите число:");
            int num = in.nextInt();

            int rez_1 = 1 * num;
            int rez_2 = 2 * num;
            int rez_3 = 3 * num;
            int rez_4 = 4 * num;
            int rez_5 = 5 * num;
            int rez_6 = 6 * num;
            int rez_7 = 7 * num;
            int rez_8 = 8 * num;
            int rez_9 = 9 * num;

            System.out.printf("Таблица умножения для числа %d: \n %d; \n %d; \n %d; \n %d; \n %d; \n %d; \n %d; \n %d; \n %d;" , num, rez_1, rez_2, rez_3, rez_4, rez_5, rez_6, rez_7, rez_8, rez_9);


        }
    }
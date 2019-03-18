import java.util.Scanner;

public class Finish_task_3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текущий курс доллара:");
        float USD = in.nextFloat();
        System.out.println("Укажите сумму для конвертации в рублях:");
        int RUB = in.nextInt();
        float res = RUB / USD;
        System.out.printf("Сумма в долларах составит: %.2f USD", res);

    }
}
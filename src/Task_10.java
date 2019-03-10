import java.util.Scanner;

public class Task_10 {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество строк матрицы:");
        int str = in.nextInt();
        System.out.println("Введите количество столбцов матрицы:");
        int stb = in.nextInt();
        int array[][] = new int[str][stb];
        System.out.println("Введите элементы матрицы:");
        for (int i = 0; i < str; i++) {
            for (int j = 0; j < stb; j++) {
                array[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < str; i++) {
            for (int j = 0; j < stb; j++) {
                array[i][j] = array[i][j] * 3;
            }
        }
        System.out.println("Элементы матрицы, умноженные на 3:");
        for (int i = 0; i < str; i++) {
            for (int j = 0; j < stb; j++) {
                System.out.print(array[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}


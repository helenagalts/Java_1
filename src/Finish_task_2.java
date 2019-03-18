import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Finish_task_2 {
    public static void swap(int[] arr, int l, int r) {
        int tmp = arr[l];
        arr[l] = arr[r];
        arr[r] = tmp;
    }

    public static int[] sub(int[] arr, int l, int r) {
        int[] res = new int[r - l];
        for (int i = l; i < r; ++i) {
            res[i - l] = arr[i];
        }
        return res;
    }

    public static void merge(int[] arr, int l, int m, int r) {
        int[] left = sub(arr, l, m);
        int[] right = sub(arr, m, r);

        int il = 0, ir = 0, ia = l;
        while (il < left.length || ir < right.length) {
            if (il >= left.length) {
                arr[ia++] = right[ir++];
            } else if (ir >= right.length || left[il] < right[ir]) {
                arr[ia++] = left[il++];
            } else {
                arr[ia++] = right[ir++];
            }
        }
    }

    public static void sort(int[] arr, int l, int r) {
        if (r - l < 2) {
            return;
        }
        if (r - l == 2) {
            if (arr[l] > arr[r - 1]) {
                swap(arr, l, r - 1);
            }
            return;
        }
        int m = (l + r) / 2;
        sort(arr, l, m);
        sort(arr, m, r);
        merge(arr, l, m, r);
    }

    public static void sort(int[] arr) {
        sort(arr, 0, arr.length);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int n = in.nextInt();
        if (n < 0) {
            System.out.println("Некорректное значение");
            return;
        }
        int[] arr = new int[n];
        System.out.println("Введите массив:");
        for(int i = 0; i < n; ++i) {
            arr[i] = in.nextInt();
        }
        sort(arr);
        System.out.println("Результат:");
        for(int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
    }
}
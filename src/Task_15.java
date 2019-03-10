import java.util.Scanner;


public class Task_15 {
    public static <T extends Comparable<T>> void bubbleSort(T[] arr){
        for(int i = arr.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( arr[j].compareTo(arr[j+1]) > 0 ){
                    T tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество элементов массива:");
        int size = in.nextInt();
        Integer array[] = new Integer[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }
        bubbleSort(array);

        for(int i = 0; i < size; ++i) {
            System.out.print(array[i]);
            System.out.print(" ");
        }
    }
}

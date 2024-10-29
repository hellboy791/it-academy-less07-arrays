import java.util.Random;
import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        //Поиск второго максимального элемента
        //Дан массив целых чисел A длиной N. Найдите второй по величине элемент массива
        //без использования встроенных функций сортировки.
        Scanner sc;
        int len;
        int firstMax;
        int secondMax;

        sc = new Scanner(System.in);
        System.out.println("Введите размерность массива:");
        len = sc.nextInt();

        int[] array = new int[len];
        initRandomMass(array);
        System.out.println("Исходный массив:");
        printMasElems(array);

        firstMax = array[0];
        secondMax = array[0];
        for (int i = 0; i < array.length; i++){
            if (array[i] > firstMax){
                secondMax = firstMax;
                firstMax = array[i];
            }
        }
        System.out.println("Второй по величине элемент массива равен " + secondMax);
    }
    public static int[] initRandomMass(int[] mas){
        Random rnd = new Random();
        for (int i = 0; i < mas.length; i++){
            mas[i ] = rnd.nextInt(100);
        }
        return mas;
    }
    public static void printMasElems(int[] mas){
        for (int i = 0; i < mas.length; i++){
            System.out.printf("[%2d]", mas[i]);
        }
        System.out.println();
    }
}

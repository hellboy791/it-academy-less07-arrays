import java.util.Random;
import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        //Дан массив целых чисел A длиной N, содержащий числа в диапазоне от 1 до K.
        //Создайте массив F длиной K, где каждый элемент F[i] содержит количество
        //вхождений числа i в массиве A.
        Scanner sc;
        int len;
        int k;
        int[] a;
        int[] f;
        int tempVal;

        sc = new Scanner(System.in);
        System.out.println("Введите размерность массива:");
        len = sc.nextInt();
        System.out.println("Введите верхнее значение диапазона чисел:");
        k = sc.nextInt();
        k++;
        a = new int[len];
        initRandomMass(a, k);
        System.out.println("Исходный массив целых чисел содержащий числа от 1 до " + k);
        printMasElems(a);

        f = new int[k];
        for (int i = 0; i < f.length; i++){
            tempVal = 0;
            for (int j = 0; j < a.length; j++){
                if (a[j] == i){
                    tempVal++;
                }
            }
            f[i] = tempVal;
        }
        System.out.println("Массив числа вхождений числа i в исходном массиве:");
        printMasElems(f);
    }
    public static int[] initRandomMass(int[] mas, int k) {
        Random rnd = new Random();
        for (int i = 0; i < mas.length; i++) {
            mas[i] = rnd.nextInt(k);
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

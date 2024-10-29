import java.util.Random;
import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        //Дан массив целых чисел A длиной N и два индекса L и R, где 0 ≤ L ≤ R < N. Разверните
        //элементы массива между индексами L и R включительно, оставив остальные
        //элементы без изменений.
        Scanner sc;
        int len;
        int l;
        int r;
        int[] a;
        int[] tempArr;
        int step;

        sc = new Scanner(System.in);
        System.out.println("Введите размерность массива:");
        len = sc.nextInt();
        System.out.println("Введите индекс L");
        l = sc.nextInt();
        System.out.println("Введите индекс R");
        r = sc.nextInt();
        if ( l < 0 || r < 0 || l >= len || r >= len ){
            throw new RuntimeException("Введенные значения должны попадать в диапазон 0 ≤ L ≤ R < N");
        }
        a = new int[len];
        initRandomMass(a, 10);
        System.out.println("Исходный массив:");
        printMasElems(a);

        tempArr = new int[a.length];
        step = r;

        for (int i = 0; i < a.length; i++){
            if (i >= l && i <= r){
                tempArr[step] = a[i];
                step--;
                continue;
            }
            tempArr[i] = a[i];
        }
        System.out.println("Массив с развернутыми элементами между индексами " + l + " и " + r + ":");
        printMasElems(tempArr);
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

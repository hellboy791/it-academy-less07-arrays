import java.util.Random;
import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        //Дан массив целых чисел A длиной N. Создайте новый массив B, содержащий все
        //уникальные элементы массива A в порядке их первого вхождения.
        Scanner sc;
        int len;
        int[] a;
        int[] b;

        sc = new Scanner(System.in);
        System.out.println("Введите размерность массива:");
        len = sc.nextInt();
        a = new int[len];

        initRandomMass(a, 10);
        System.out.println("Исходный массив:");
        printMasElems(a);
        System.out.println("Массив уникальных элементов:");
        a = getIniqueMass(a);
        printMasElems(a);

    }
    public static int[] initRandomMass(int[] mas, int k) {
        Random rnd = new Random();
        for (int i = 0; i < mas.length; i++) {
            mas[i] = rnd.nextInt(k);
        }
        return mas;
    }
    public static int[] getIniqueMass(int[] mass){
        int[] tempArray;
        boolean isInArray;

        tempArray = new int[mass.length];

        int count = 0;

        for (int i = 0; i < mass.length; i++){
            isInArray = true;
            for (int j = 0; j < i; j++){
                if (mass[i] == mass[j]){
                    isInArray = false;
                    continue;
                }
            }
            if (isInArray){
                tempArray[count] = mass[i];
                count++;
            }
        }
        mass = new int[count];
        for (int i = 0; i < count; i++){
            mass[i] = tempArray[i];
        }
        return mass;
    }
    public static void printMasElems(int[] mas){
        for (int i = 0; i < mas.length; i++){
            System.out.printf("[%2d]", mas[i]);
        }
        System.out.println();
    }
}

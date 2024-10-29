import java.util.Random;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        //Циклический сдвиг элементов массива
        //Дан одномерный целочисленный массив A длиной N и число K. Реализуйте алгоритм
        //циклического сдвига элементов массива на K позиций вправо. Элементы, выходящие
        //за пределы массива, должны перемещаться в начало.

        int[] mas;
        int[] dMas;
        int len;
        int count;
        Scanner sc;

        sc = new Scanner(System.in);
        System.out.println("Введите размерность массива:");
        len = sc.nextInt();
        mas = new int[len];
        System.out.println("Введите число для смещения элементов массива:");
        count = sc.nextInt();
        mas = initRandomMass(mas);
        dMas = displacementElements(mas, count);
        printMasElems(mas);
        printMasElems(dMas);

    }

    public static int[] initRandomMass(int[] mas){
        Random rnd = new Random();
        for (int i = 0; i < mas.length; i++){
            mas[i ] = rnd.nextInt(100);
        }
        return mas;
    }

    public static int[] displacementElements(int[] mas, int count){
        int [] massDisp;
        massDisp = new int[mas.length];
        for (int i = 0; i < mas.length; i++){
            massDisp[getNewIndex(i, count, mas.length)] = mas[i];
        }
        return massDisp;
    }

    public static int getNewIndex(int curIndex, int count, int masLen){
        //count - это значение смещения
        int res;

        res = curIndex;

        for (int i = 0; i < count; i++){
            if (res != masLen - 1){
                res++;
            } else {
                res = 0;
            }
        }
        return res;
    }
    public static void printMasElems(int[] mas){
        for (int i = 0; i < mas.length; i++){
            System.out.printf("[%4d]", mas[i]);
        }
        System.out.println();
    }
}


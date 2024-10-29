public class Task03 {
    public static void main(String[] args) {
        //Объединение и сортировка двух массивов
        //Даны два отсортированных по возрастанию массива целых чисел A длиной N и B
        //длиной M. Объедините эти массивы в один отсортированный по возрастанию массив
        //C длиной N + M.
        int maxLenMas;
        int[] resMas;
        int[] firstMas = {1,-4,6,9,19};
        int[] secondMas = {3,8,11, -65};
        resMas = new int[firstMas.length + secondMas.length];

        System.out.println("Исходный массив №1:");
        printMasElems(firstMas);
        System.out.println("Исходный массив №2:");
        printMasElems(secondMas);

        int i = 0;
        for (int j = 0; j < firstMas.length; j++){
            resMas[i] = firstMas[j];
            i++;
        }
        for (int j = 0; j < secondMas.length; j++){
            resMas[i] = secondMas[j];
            i++;
        }

        resMas = sortArrayByAccending(resMas);
        System.out.println("Объединенный и отсортированный по возрастанию массив:");
        printMasElems(resMas);

    }
    public static int[] sortArrayByAccending(int[] array){
        int tempValue;

        for (int i = 0; i < array.length; i++){
            for (int j = i + i; j < array.length; j++){
                if (array[i] > array[j]){
                    tempValue = array[i];
                    array[i] = array[j];
                    array[j] = tempValue;
                }
            }
        }
        return array;
    }
    public static void printMasElems(int[] mas){
        for (int i = 0; i < mas.length; i++){
            System.out.printf("[%2d]", mas[i]);
        }
        System.out.println();
    }
}

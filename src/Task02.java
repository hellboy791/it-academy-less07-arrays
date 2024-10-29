public class Task02 {
    public static void main(String[] args) {
        //Проверка массива на палиндром
        //Дан массив символов A длиной N. Определите, является ли этот массив палиндромом
        //(читается одинаково слева направо и справа налево).
        String [] mas = {"t", "E", "n", "e", "T"};
        boolean isPal;
        isPal = true;

        System.out.println("Исходный массив:");
        printMasElems(mas);
        for (int i = 0; i < mas.length; i++){
            if (!mas[i].toLowerCase().equals(mas[mas.length - 1 - i].toLowerCase())){
                System.out.println("Массив не является палиндромом!");
                isPal = false;
                break;
            } else {
                continue;
            }
        }
        if (isPal){
            System.out.println("Массив является палиндромом!");
        }
    }
    public static void printMasElems(String[] mas){
        for (int i = 0; i < mas.length; i++){
            System.out.print("["+ mas[i] +"]");
        }
        System.out.println();
    }
}

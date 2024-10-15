package HW8.HW8.Task1.src;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 3, 4, 4, 4};
        int[] array2 = new int[5];
        //todo

//        for (int i=0; i<array.length; i++) {
//            System.out.println(array[i]);
//        }
        //todo

        //#3 Распечатать все значения массива с конца (начиная с последнего до 0 индексов).
        //todo
//        for (int i = array.length - 1; i >= 0; i--) {
//            System.out.println(array[i]);
//        }

        //#4 *** Задание особой сложности. Развернуть массив(см конец урока).
        //todo
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

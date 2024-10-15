package HW8.HW8.Task2.src;

import java.util.Random;

public class Main2 {
    public static void main(String[] args) {
//       int [] array = {1,2,3,4,5,6,7,8,9,10};
//
//       for (int i = 0; i < array.length / 2; i++) {
//           int temp = array[i];
//           array[i] = array[array.length-1-i];
//           array[array.length-i-1] = temp;
//       }
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }
        float [] array = new float[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (new Random().nextFloat() * 60) + 40;

        }
        float temp = 0;
        for (int i = 0; i < array.length; i++) {
            temp += array[i];
        }
        temp /= array.length;
        System.out.println(temp);
        System.out.println("============");
        int people = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 60 && array[i] <= 80 ) {
                people++;
            }
        }
        System.out.println(people);
    }
}

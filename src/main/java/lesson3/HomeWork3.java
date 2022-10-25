package lesson3;

import java.util.Arrays;

public class HomeWork3 {

    public static void main(String[] args) {
        replacement();
        hundred();
        multiplication();
        int[] newArray = getNewArray(9, 55);
        System.out.println(Arrays.toString(newArray));
    }

    public static void replacement() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] =1;
            }
            System.out.println(Arrays.toString(arr));
        }
    }

    private static void hundred() {
        int[] arr1 = new int[100];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr1));
    }

    private static void multiplication() {
        int[] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arr2.length; i++) {
            int value = arr2[i];
            if (value < 6) {
                arr2[i] = value * 2;
            }
        }
        System.out.println(Arrays.toString(arr2));
    }

        private static int[] getNewArray(int len, int initialValue) {
            int[] arr5 = new int[len];
            Arrays.fill(arr5, initialValue);
            return arr5;
        }
}



package academy.learnprogramming;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myArray = getArray();
        printArray(myArray);

        reverse(myArray);
        printArray(myArray);
        System.out.println("Sorted array : " + Arrays.toString(sortArray(myArray)));
    }

    private static int[] getArray() {
        System.out.print("Enter the number of elements of the array : ");
        int numOfElements = scanner.nextInt();
        scanner.nextLine();

        int[] newArray = new int[numOfElements];

        for(int i = 0; i < numOfElements; i ++) {
            System.out.print("Element #" + (i + 1) + " : ");
            newArray[i] = scanner.nextInt();
            scanner.nextLine();
        }

        return newArray;
    }

    private static void printArray(int[] array) {
        System.out.println("The current order of array elements : " + Arrays.toString(array));
    }

    private static void reverse(int[] array) {
//        int[] reversedArray = new int[array.length];
//        for(int i = 0; i < array.length; i++) {
//            reversedArray[i] = array[(array.length - 1) - i];
//        }
//        System.out.println("Original array = " + Arrays.toString(array));
//        System.out.println("Reversed array = " + Arrays.toString(reversedArray));
//        for(int j = 0; j < array.length; j++) {
//            array[j] = reversedArray[j];
//        }
        int maxIndex = array.length - 1;
        int halfPointIndex = array.length / 2;
        for(int i = 0; i < halfPointIndex; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
        System.out.println("---------------------");
//        System.out.println("Reversed original array = " + Arrays.toString(array));
        System.out.println("reverse() => Array has been reversed.");
        System.out.println("---------------------");
    }

    private static int[] sortArray(int[] array) {
//        for(int i = 0; i < (array.length - 1); i++) {
//            for(int j = 0; j < (array.length - 1); j++) {
//                int temp;
//                if(array[j] > array[j + 1]) {
//                    temp = array[j];
//                    array[j] = array[j + 1];
//                    array[j + 1] = temp;
//                }
//            }
//        }
//
//        return array;

        int[] sortedArray = Arrays.copyOf(array, array.length);

        boolean bubbleMark = true;
        int temp;

        while(bubbleMark) {
            bubbleMark = false;

            for(int i = 0; i < (sortedArray.length - 1); i++) {
                if(sortedArray[i] > sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    bubbleMark = true;
                }
            }
        }

        return sortedArray;
    }
}

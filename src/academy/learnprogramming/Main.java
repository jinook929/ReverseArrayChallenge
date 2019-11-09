package academy.learnprogramming;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myArray = getArray();
        printArray(myArray);

        System.out.println("---------------------");
        reverse(myArray);
        System.out.println("---------------------");

        printArray(myArray);
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
        int[] reversedArray = new int[array.length];
        for(int i = 0; i < array.length; i++) {
            reversedArray[i] = array[(array.length - 1) - i];
        }
        System.out.println("Original array = " + Arrays.toString(array));
        System.out.println("Reversed array = " + Arrays.toString(reversedArray));
        for(int j = 0; j < array.length; j++) {
            array[j] = reversedArray[j];
        }
        System.out.println("Reversed original array = " + Arrays.toString(array));
    }
}

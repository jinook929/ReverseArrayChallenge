package academy.learnprogramming;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] newArray = getArray();
        printArray(newArray);
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
//        for(int i = 0; i < array.length; i++)
        System.out.println("The array in the original order : " + Arrays.toString(array));
    }

    private static void reverse(int[] array) {

    }
}

package com.csplusplus;

public class Unit6 {

    // 1. Implement a method that takes an array of integers and returns the sum of all elements.
    // Instructions: Use a for-each loop to iterate through the array and calculate the sum.
    public static int sumArray(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    // 2. Implement a method that finds the maximum element in an array of integers.
    // Instructions: Iterate through the array and track the largest number found.
    public static int maxElement(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    // 3. Implement a method that takes an array and returns a new array with the elements in reverse order.
    // Instructions: Create a new array of the same size, and fill it with elements from the original array in reverse order.
    public static int[] reverseArray(int[] array) {
        int[] reverse = new int[array.length];
        int pos = 0;
        for (int i = (array.length - 1); (i > 0); i--) {
            reverse[pos] = array[i];
            pos++;
        }
        return reverse;
    }

    // 4. Implement a method that checks whether the given array is sorted in ascending order.
    // Instructions: Iterate through the array and check if each element is greater than or equal to the previous element.
    public static boolean isSorted(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                return false;
            }
        }
        return true;
    }

    // 5. Implement a method that counts how many times a given number appears in the array.
    // Instructions: Use a for-each loop to iterate through the array and count the occurrences of the given number.
    public static int countOccurrences(int[] array, int number) {
        int count = 0;
        for (int num : array) {
            if (num == number) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] testArray = {1, 2, 3, 4, 5, 2, 2, 7, 2, 12};
        int[] sortedArray = {1, 2, 3, 4, 5, 7, 12};
        
        System.out.println("Sum of array: " + sumArray(testArray));
        System.out.println("Max element: " + maxElement(testArray));
        System.out.println("Is testArray sorted: " + isSorted(testArray));
        System.out.println("Is sortedArray sorted: " + isSorted(sortedArray));
        System.out.println("Count of 2 in testArray (Should be 4): " + countOccurrences(testArray, 2));
        System.out.println("Count of 7 in testArray (Should be 1): " + countOccurrences(testArray, 7));
    }
}

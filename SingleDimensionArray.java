package Arrays;

import java.util.Arrays;

public class SingleDimensionArray {
    int arr[] = null;

    // Constructor to initialize the array elements to Integer.MIN_VALUE
    public SingleDimensionArray(int sizeOfArray) {
        arr = new int[sizeOfArray];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.MIN_VALUE;
        }
    }

    // Method to insert values into the array
    public void insert(int location, int valueToInsert) {
        try {
            if (arr[location] == Integer.MIN_VALUE) {
                arr[location] = valueToInsert;
                System.out.println("Successfully inserted at index " + location);
            } else {
                System.out.println("This cell is already occupied");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index to access array: " + e);
        }
    }

    // Method to traverse and print the array
    public void traverseArray() {
        System.out.println("Array elements are:");
        for (int value : arr) {
            System.out.println(value);
        }
    }

    // Method to delete an element by setting it to Integer.MIN_VALUE
    public void deleteValue(int valueToDelete) {
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == valueToDelete) {
                arr[i] = Integer.MIN_VALUE;
                found = true;
                System.out.println("Value " + valueToDelete + " deleted from index " + i);
                break;
            }
        }
        if (!found) {
            System.out.println("Value " + valueToDelete + " not found in the array.");
        }
    }

    // Method to delete all elements from the array
    public void deleteAll() {
        Arrays.fill(arr, Integer.MIN_VALUE);
        System.out.println("All elements deleted successfully.");
    }

    // Method to search for an element in the array
    public boolean searchInArray(int valueToSearch) {
        for (int value : arr) {
            if (value == valueToSearch) {
                System.out.println("Value " + valueToSearch + " exists in the array.");
                return true;
            }
        }
        System.out.println("Value " + valueToSearch + " not found in the array.");
        return false;
    }

    // Main method to run and test the SingleDimensionArray functionalities
    public static void main(String[] args) {
        SingleDimensionArray singleDimensionArray = new SingleDimensionArray(10);
        singleDimensionArray.insert(0, 1);
        singleDimensionArray.insert(1, 2);
        singleDimensionArray.insert(2, 3);
        singleDimensionArray.traverseArray();
        singleDimensionArray.deleteValue(2);
        singleDimensionArray.traverseArray();
        singleDimensionArray.deleteAll();
        singleDimensionArray.traverseArray();
        singleDimensionArray.searchInArray(3);
    }
}

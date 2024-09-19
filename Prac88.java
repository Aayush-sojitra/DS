import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Prac88 {
    private static final int ARRAY_SIZE = 20;
    private static final int NUM_VALUES = 15;
    private static final int MIN_VALUE = 100000;
    private static final int MAX_VALUE = 999999;

    public static void main(String[] args) {
        // Array to store the values
        Integer[] hashTable = new Integer[ARRAY_SIZE];
        HashSet<Integer> uniqueValues = new HashSet<>();
        Random random = new Random();

        // Generate 15 unique random values
        while (uniqueValues.size() < NUM_VALUES) {
            int value = MIN_VALUE + random.nextInt(MAX_VALUE - MIN_VALUE + 1);
            uniqueValues.add(value);
        }

        // Insert values into the hash table
        for (int value : uniqueValues) {
            insertIntoHashTable(hashTable, value);
        }

        // Display the final values of the hash table
        displayHashTable(hashTable);
    }

    private static void insertIntoHashTable(Integer[] hashTable, int value) {
        int index = hashFunction(value);
        int originalIndex = index;

        // Linear probing to find an empty spot
        while (hashTable[index] != null) {
            index = (index + 1) % ARRAY_SIZE;
            // If we've looped back to the original index, the table is full
            if (index == originalIndex) {
                System.out.println("Hash table is full, could not insert value: " + value);
                return;
            }
        }

        // Insert the value into the hash table
        hashTable[index] = value;
    }

    private static int hashFunction(int x) {
        return (x % 18) + 2;
    }

    private static void displayHashTable(Integer[] hashTable) {
        System.out.println("Final values in the hash table:");
        for (int i = 0; i < hashTable.length; i++) {
            if (hashTable[i] != null) {
                System.out.println("Index " + i + ": " + hashTable[i]);
            } else {
                System.out.println("Index " + i + ": null");
            }
        }
    }
}

package Binary_search;

import java.util.Scanner;

// BS_Last_Recursive.java: Binary search to find the last index of a duplicate target (Recursive).

class BS_Last_Recursive {
    static int findLastOccurrence(int[] arr, int target, int low, int high, int result) {
        if (low > high) {
            return result;
        }
        int mid = low + (high - low) / 2;
        if (arr[mid] == target) {
            result = mid; 
            return findLastOccurrence(arr, target, mid + 1, high, result); // Recurse right
        } else if (arr[mid] < target) {
            return findLastOccurrence(arr, target, mid + 1, high, result); // Recurse right
        } else {
            return findLastOccurrence(arr, target, low, mid - 1, result); // Recurse left
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] data = new int[5];

        for(int i=0; i<5; i++){
            data[i] = sc.nextInt();
        }

        int key = 30;
        sc.close();
        System.out.println(findLastOccurrence(data, key, 0, data.length - 1, -1));
    }
}

package Binary_search;

// BS_First_Recursive.java: Binary search to find the first index of a duplicate target (Recursive).

class BS_First_Recursive {
    static int findFirstOccurrence(int[] arr, int target, int low, int high, int result) {
        if (low > high) {
            return result;
        }
        int mid = low + (high - low) / 2;
        if (arr[mid] == target) {
            result = mid; 
            return findFirstOccurrence(arr, target, low, mid - 1, result); // Recurse left
        } else if (arr[mid] < target) {
            return findFirstOccurrence(arr, target, mid + 1, high, result); // Recurse right
        } else {
            return findFirstOccurrence(arr, target, low, mid - 1, result); // Recurse left
        }
    }
    public static void main(String[] args) {
        int[] data = {10, 20, 30, 30, 30, 40, 50};
        int key = 30;
        System.out.println(findFirstOccurrence(data, key, 0, data.length - 1, -1));
    }
}

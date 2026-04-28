package Binary_search;

// BS_Last_Iterative.java: Binary search to find the last index of a duplicate target (Iterative).

class BS_Last_Iterative {
    static int findLastOccurrence(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                result = mid; 
                low = mid + 1; 
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] data = {10, 20, 30, 30, 30, 40, 50};
        int key = 30;
        System.out.println(findLastOccurrence(data, key));
    }
}
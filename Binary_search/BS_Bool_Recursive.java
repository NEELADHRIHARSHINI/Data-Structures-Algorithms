package Binary_search;

// BS_Bool_Recursive.java: Binary search returning true/false using recursion.

class BS_Bool_Recursive {
    static boolean binarySearch(int[] arr, int target, int low, int high) {
        if (low > high) {
            return false;
        }
        int mid = low + (high - low) / 2;
        if (arr[mid] == target) {
            return true;
        } else if (arr[mid] < target) {
            return binarySearch(arr, target, mid + 1, high);
        } else {
            return binarySearch(arr, target, low, mid - 1);
        }
    }
    public static void main(String[] args) {
        int[] data = {10, 20, 30, 40, 50};
        int key = 30;
        System.out.println(binarySearch(data, key, 0, data.length - 1));
    }
}
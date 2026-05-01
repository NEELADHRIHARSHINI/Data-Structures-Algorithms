//we have arr of n int which or sorted but roteated at some unknown point u are also given a target element x now find the index of x in arr if not found return -1, assume no duplicate exists in arr, expected time complexity is O(log n)

package Binary_search;

public class BS_rotated_arr {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int result = search(arr, target);
        System.out.println("Index of " + target + " is: " + result);
    }

    static int search(int[] arr, int target) {
        int l = 0, h = arr.length - 1;
        while (l <= h) {
            int mid = (l + h) / 2;
            if (arr[mid] == target) return mid;
            if (arr[l] <= arr[mid]) {
                if (arr[l] <= target && target < arr[mid]) h = mid - 1;
                else l = mid + 1;
            } else {
                if (arr[mid] < target && target <= arr[h]) l = mid + 1;
                else h = mid - 1;
            }
        }
        return -1;
    }
}
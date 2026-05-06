// u r given sorted and rotated ele and in this case rotated means last el is placend in frot find no of rotatins that took place to get the rotated arr

package Binary_search;
public class problem2 {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int rotations = findRotations(arr);
        System.out.println("Number of rotations: " + rotations);
    }

    static int findRotations(int[] arr) {
        int l = 0, h = arr.length - 1;
        while (l < h) {
            int mid = (l + h) / 2;
              if (arr[mid] > arr[h]) l = mid + 1;
            else h = mid;
        }
        return l;
    }
}

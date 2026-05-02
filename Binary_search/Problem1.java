package Binary_search;
import java.util.*;

public class Problem1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter size of the array: ");
    int n = sc.nextInt();
    System.out.print("Enter array elements: ");
    int[] a = new int[n];
    for(int i = 0; i < n; i++) a[i] = sc.nextInt();
    System.out.print("Enter target element to count frequency: ");
    int target = sc.nextInt();
    System.out.print("Frequency counted using binary search for: " +target+" is: "+countFrequencyUsingBinary(target, a, n));
    sc.close();  
  }

  static int countFrequencyUsingBinary(int target, int[] a, int n) {
    int first = firstOccurrence(target, a, n);
    if(first == -1) return 0;
    int last = lastOccurrence(target, a, n);
    return last - first + 1;
  }

  static int firstOccurrence(int target, int[] a, int n) {
    int l = 0, h = n - 1;
    int index = -1;
    while(l <= h) {
      int mid = (l + h) / 2;
      if(a[mid] == target) {
        h = mid - 1;
        index = mid;
      }else if(a[mid] > target) {
        h = mid - 1;
      }else {
        l = mid + 1;
      }
    }
      return index;
  }

  static int lastOccurrence(int target, int[] a, int n) {
    int l = 0, h = n - 1;
    int index = -1;
    while(l <= h) {
      int mid = (l + h) / 2;
      if(a[mid] == target) {
        l = mid + 1;
        index = mid;
      }
      else if(a[mid] > target) {
        h = mid - 1;
      }
      else {
        l = mid + 1;
      }
    }
    return index;
  }
}



// You are given array of n integers which are sorted and contains duplicate elements you are also given a target element x, now find frequency of x(count of occurrences of x) using binary search also solve the same problem using lineae search and compare performance analysis
//Example:
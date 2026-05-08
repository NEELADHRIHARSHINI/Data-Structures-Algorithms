//given x and n find x^n using binary search
package Binary_search;
public class xpown {
    static double power(double x, int n) {
        if (n == 0) return 1;
        double half = power(x, n / 2);
        if (n % 2 == 0) return half * half;
        else return half * half * x;
    }
    public static void main(String[] args) {
        double x = 2.0;
        int n = 10;
        System.out.println(power(x, n));
    }
}

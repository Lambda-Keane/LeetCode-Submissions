class Solution {
    public int reverse(int x) {
        int signum = 1;
        if (x < 0) {
            signum = -1;
            x = x*-1;
        }
        long res = 0;
        while (x > 0) {
            res = res*10 + x%10;
            if (res > Integer.MAX_VALUE) return 0;
            x /= 10;
        }
        return (int) res * signum;
    }
}
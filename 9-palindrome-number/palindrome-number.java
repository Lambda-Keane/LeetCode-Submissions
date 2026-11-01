class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        if (x == 0) return true;
        int tmp = x;
        int n = 0;
        while (tmp > 0) {
            n++;
            tmp /= 10;
        }
        tmp = 0;
        int i = 1;
        while (i <= n/2) {
            tmp = tmp*10 + x % 10;
            x /= 10;
            i++;
        }
        if (n % 2 == 1) x /= 10;
        return tmp == x;
    }
}
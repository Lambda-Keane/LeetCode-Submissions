class Solution {
    public long minimumMaxValue(int n, int index, int value) {
        if (value == 1) return -1;
        long res = -1;
        if (value % 2 == 0) {
            res = (long) value + (n - index - 1)*2;
            if (value - index*2 <= 1) return -1;
        } else {
            int minDivisor = minDivisor(value);
            int gap = n - index - 1;
            if (index == n - 1) {
                res = value;
            } else {
                res = (long) value + minDivisor;
                if (gap > 1) {
                    res = (long) res + (n - index - 2)*2;
                }
            }
            if (index > 0) {
                if (value == minDivisor) return -1;
                int prevVal = value - minDivisor;
                if (prevVal - (index-1)*2 <= 1) return -1;  
            }
        }
        return res;
    }
    public int minDivisor(int value) {
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) return i;
        }
        return value;
    }
}
class Solution {
    public long minimumMaxValue(int n, int index, int value) {
        if (value == 1) return -1;

        int min = minDivisor(value);
        
        if ((long) value - min <= (index-1)*2L) return -1;

        if (index == n-1) return (long) value;
        return (long) value + min + (n-index-2)*2L;
    }
    public int minDivisor(int value) {
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) return i;
        }
        return value;
    }
}
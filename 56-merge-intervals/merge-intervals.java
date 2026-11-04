class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(row -> row[0]));
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i-1][1] >= intervals[i][1]) {
                intervals[i][0] = intervals[i-1][0];
                intervals[i][1] = intervals[i-1][1];
                intervals[i-1][0] = -1;
            } else if (intervals[i-1][1] >= intervals[i][0]) {
                intervals[i][0] = intervals[i-1][0];
                intervals[i-1][0] = -1;
            } else {
                continue;
            }
        }
        int[][] res = Arrays.stream(intervals)
                            .filter(row -> row[0] != -1)
                            .toArray(int[][]::new);
        return res;
    }
}
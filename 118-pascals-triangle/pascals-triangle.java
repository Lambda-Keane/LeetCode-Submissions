class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(List.of(1));
        if (numRows == 1) return result;
        int i = 0;
        while (i < numRows - 1) {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            for (int j = 0; j < i; j++) {
                List<Integer> tmp = result.get(i);
                list.add(tmp.get(j) + tmp.get(j+1));
            }
            list.add(1);
            result.add(list);
            i++;
        }
        return result;
    }
}
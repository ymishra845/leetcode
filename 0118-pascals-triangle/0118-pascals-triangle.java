class Solution {
    public List<List<Integer>> generate(int numRows) {
         List<List<Integer>> pascalTriangle = new ArrayList<>();
		
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || i == j) {
                    row.add(1);
                } else {
                    int num = pascalTriangle.get(i - 1).get(j) + pascalTriangle.get(i - 1).get(j - 1);
                    row.add(num);
                }
            }
            pascalTriangle.add(row);
        }
		
        return pascalTriangle;
    }
}
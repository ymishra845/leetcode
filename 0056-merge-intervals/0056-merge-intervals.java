class Solution {
    public int[][] merge(int[][] intervals) {
        
         int n = intervals.length;
        if (n <= 1) {
            return intervals;
        }

        // Sort the intervals by their starting points
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> result = new ArrayList<>();
        int[] currentInterval = intervals[0];

        for (int i = 1; i < n; i++) {
            int[] nextInterval = intervals[i];

            if (currentInterval[1] >= nextInterval[0]) {
                // Merge overlapping intervals
                currentInterval[1] = Math.max(currentInterval[1], nextInterval[1]);
            } else {
                result.add(currentInterval);
                currentInterval = nextInterval;
            }
        }

        result.add(currentInterval); // Add the last merged interval
        return result.toArray(new int[result.size()][]);
    }
}
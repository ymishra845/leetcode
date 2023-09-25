import java.util.*;

class Solution {
    public int countNegatives(int[][] grid) {
        //Write code here
		int m=grid.length;
        int n=grid[0].length;
        int res=0;
        int col=0;
        int row= m-1;
        while(row>=0 && col<n){
            if(grid[row][col]>=0){
                col++;
            }else{
                res+= n-col;
                row--;
            }
        }
        return res;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), n = sc.nextInt();
        int[][] grid = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();
        }
        sc.close();
        Solution Obj = new Solution();
        System.out.println(Obj.countNegatives(grid));

        sc.close();
    }
}

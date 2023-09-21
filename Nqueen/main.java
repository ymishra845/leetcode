import java.util.*;

public class main {
	public static void solve(int col,char[][]board,int[]LeftRow,int[] LowerDiagonal, int[] UpperDiagonal,ArrayList<ArrayList<String>>res){
		if(col==board.length){
			res.add(Construct(board));
			return;
		}
		for(int row=0;row<board.length;row++){
			if(LeftRow[row]==0 && LowerDiagonal[col+row]==0 && UpperDiagonal[(board.length-1)+col-row]==0){
				board[row][col]='q';
				LeftRow[row]=1;
				 LowerDiagonal[col+row]=1;
				 UpperDiagonal[board.length-1+col-row]=1;
				solve(col+1,board,LeftRow,LowerDiagonal,UpperDiagonal,res);
				board[row][col]='.';
				LeftRow[row]=0; 
				LowerDiagonal[col+row]=0; 
				UpperDiagonal[board.length-1+col-row]=0;
			}
		}
	}
	public static ArrayList<String> Construct(char[][]board){
		ArrayList<String> res= new ArrayList<>();
		for(int i=0;i<board.length;i++){
			String s= new String(board[i]);
			res.add(s);
		}
		return res;
	}
    public static int totalNQueens(int n) {
        // write code here
		char[][] board= new char[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				board[i][j]='.';
			}
		}
		ArrayList<ArrayList<String>> res= new ArrayList<>();
		int[] LeftRow= new int[n];
		int[] LowerDiagonal=new int[2 * n -1 ];
		int[] UpperDiagonal=new int[2 * n -1 ];
		solve(0,board,LeftRow,LowerDiagonal,UpperDiagonal,res);
		return res.size();
    }

    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();    
        System.out.println(totalNQueens(n));
    }
}
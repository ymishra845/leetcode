class Solution {
    public int[] asteroidCollision(int[] ast) {
        
        Stack<Integer> st= new Stack<>();
		int n=ast.length;
		for(int i=0;i<n;i++){
			if(st.isEmpty()){
				st.push(ast[i]);
				continue;
			}
			if(st.peek()>0 && ast[i]<0){
				while(!st.isEmpty() && st.peek()>0 && Math.abs(ast[i])>st.peek()){
					st.pop();
				}
				if(st.isEmpty()){
					st.push(ast[i]);
				}else{
					if(st.peek()<0){
						st.push(ast[i]);
					}
					if(Math.abs(ast[i])==st.peek()){
						st.pop();
					}
				}
			}else{
				st.push(ast[i]);
			}
		}
		// put the answer in an array
		int m=st.size();
		int ans[]= new int[m];
		for(int i=m-1;i>=0;i--){
			ans[i]=st.pop();
		}
		return ans;
    }
}
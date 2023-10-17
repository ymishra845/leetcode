class Solution {
    public int[] canSeePersonsCount(int[] h) {
        Stack<Integer> st= new Stack<>();
		int n=h.length;
		int count[]= new int[n];

		for(int i=0;i<n;i++){
			while(st.size()>0 && h[st.peek()]<=h[i]){
				int index=st.peek();
				st.pop();
				count[index]++;
			}if(st.size()>0){
				
				count[st.peek()]++;
			}
			st.push(i);
		}
		
		return count;
        
    }
}
class Solution {
    public int hardestWorker(int n, int[][] logs) {
        int res=logs[0][0]; // assign initial one as result;
        int max=logs[0][1]; //  assign the initial column on 0th row as max;

        for(int i=1;i<logs.length;i++){
            if(logs[i][1]-logs[i-1][1]>max){  // we are comparing row with the
                                        // one in 1st column of leaving time
            res=logs[i][0];
            max=logs[i][1]-logs[i-1][1];

            }else if(logs[i][1]-logs[i-1][1]==max && res>logs[i][0]){
                res= logs[i][0];
            }
        }
        return res;
    }
}
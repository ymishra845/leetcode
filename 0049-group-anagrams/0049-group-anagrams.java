class Solution {
    public static String sorted(String curr){
        char temp[]=curr.toCharArray();
        Arrays.sort(temp);
        return new String(temp);
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> hm= new HashMap<>();
        ArrayList<String> al= new ArrayList<>();
        int n=strs.length;
        for(int i=0;i<n;i++){
            String curr=strs[i];
            String sortedString=sorted(curr);
            if(hm.containsKey(sortedString)){
                ArrayList<String> temp=hm.get(sortedString);
                temp.add(curr);
                hm.put(sortedString,temp);
            }else{
                ArrayList<String> temp=new ArrayList<>();
                temp.add(curr);
                hm.put(sortedString,temp);
            }
        }
        return new ArrayList<>(hm.values());
    }
}
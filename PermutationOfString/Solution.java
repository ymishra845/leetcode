import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;
import java.lang.*; 
class Solution{
    

    public static boolean checkInclusion(String s1, String s2) {
        //Write your code here 
		int[] map = new int[26];
        for(char c : s1.toCharArray()) map[c - 'a']++;
        int j = 0, i = 0;
        int count_chars = s1.length();
        while(j < s2.length()){
            if(map[s2.charAt(j) - 'a'] > 0) //if map of j having count greater than 0 then check for another by j++ 
				                 //and rduce it from map by map--
				j++;
				map[s2.charAt(j)-'a']--;
                count_chars--;
            if(count_chars == 0) return true;
            if(j - i == s1.length() && map[s2.charAt(i++) - 'a']++ >= 0)
                count_chars++;
        }
        return false;
    }
}
public class Main {
    public static void main(String args[])throws IOException{
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         String s = br.readLine();
         String ip[] = s.split(" ");
        System.out.print(Solution.checkInclusion(ip[0],ip[1]));
    }
}

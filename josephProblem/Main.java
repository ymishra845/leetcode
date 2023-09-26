import java.util.*;
import java.io.*;

class Solution {
    public static int result(ArrayList<Integer> arr, int k, int index) {
        if (arr.size() == 1) {
            return arr.get(0);
        }

        index = (index + k) % arr.size();
        arr.remove(index);
        return result(arr, k, index);
    }

    static int solve(int n, int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            arr.add(i);
        }
        k = k - 1;
        int index = 0;
        return result(arr, k, index);
    }
}

public class Main {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        System.out.println(Solution.solve(n, m));
    }
}

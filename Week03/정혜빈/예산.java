import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int sum_cost = 0;
        
        Arrays.sort(d);
        
        for (int i = 0; i < d.length; i++) {
            if (sum_cost + d[i] > budget) {
                break;
            }
            sum_cost += d[i];
            answer += 1;
        }
        return answer;
    }
}

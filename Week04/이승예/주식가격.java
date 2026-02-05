import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int n = prices.length;
        int[] answer = new int[n];
        
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            queue.offer(prices[i]);
        }
        
        for (int i = 0; i < n; i++) {
            int current = queue.poll();
            int count = 0;
            boolean isDown = false;
            
            for (int next : queue) {
                count++;
                if (next < current) {
                    isDown = true;
                    break;
                }
            }
            
            answer[i] = isDown ? count : queue.size();
        }
        return answer;
    }
}

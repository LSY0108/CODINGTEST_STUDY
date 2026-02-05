import java.util.*;
class Solution {
    public int solution(int[] queue1, int[] queue2) {
        int n = queue1.length;
        
        Queue<Integer> q1 = new ArrayDeque<>();
        Queue<Integer> q2 = new ArrayDeque<>();
        
        long sum1 = 0;
        long sum2 = 0;
        
        for (int i : queue1) {
            q1.offer(i);
            sum1 += i;
        }
        
        for (int i : queue2) {
            q2.offer(i);
            sum2 += i;
        }
        
        int count = 0;
        int limit = 4 * n;
        
        while (count <= limit) {
            if (sum1 == sum2) return count;
            
            if (sum1 > sum2) {
                int x = q1.poll();
                q2.offer(x);
                sum1 -= x;
                sum2 += x;
            } else {
                int x = q2.poll();
                q1.offer(x);
                sum2 -= x;
                sum1 += x;
            }
            count++;
        }
        return -1;
    }
}

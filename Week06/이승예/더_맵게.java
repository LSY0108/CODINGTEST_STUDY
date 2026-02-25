import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int count = 0;
        
        for (int i = 0; i < scoville.length; i++) {
            pq.offer(scoville[i]);
        }
        
        
        while(pq.size() >= 2 && pq.peek() < K){
            int first = pq.poll();
            int second = pq.poll();
            
            int newScoville = 0;
            newScoville = first + (second * 2);
            
            pq.offer(newScoville);
            
            count++;
        }
        
        if (pq.peek() >= K) {
            return count;
        }
        return -1;
    }
}

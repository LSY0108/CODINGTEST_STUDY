import java.util.*;
class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> queue = new ArrayDeque<>();
        
        int time = 0;
        int currentWeight = 0;
        int idx = 0;
        
        for (int i = 0; i < bridge_length; i++) {
            queue.offer(0);
        }
        
        while (idx < truck_weights.length) {
            time++;
            
            // 다리 맨 앞 칸 제거
            currentWeight -= queue.poll();
        
            // 다음 트럭을 다리에 올릴 수 있는지 검사
            if(currentWeight + truck_weights[idx] <= weight) {
                queue.offer(truck_weights[idx]); 
                
                // 다리 위 총 무게 갱신
                currentWeight += truck_weights[idx];
                
                // 다음 트럭을 가리키도록 인덱스 증가
                idx++;
            } else{
                // 무게 초과
                // 트럭 대신 0을 넣기
                queue.offer(0);
            }
        }
        // 마지막 트럭이 다리를 완전히 건너는 데 필요한 시간 추가
        time += bridge_length;
        
        return time;
    }
}

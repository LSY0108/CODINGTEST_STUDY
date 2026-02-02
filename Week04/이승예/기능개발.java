import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int pl = progresses.length;
        int[] days = new int[pl];
        
        // 1. 각 기능이 완료되기까지 걸리는 날짜 계산
        // ex) progresses = [93, 30, 55], speeds = [1, 30, 5]
        // → days = [7, 3, 9]
        for (int i = 0; i < pl; i++){
            int n = 100 - progresses[i];
            int day = n / speeds[i];
            
            if (n % speeds[i] != 0) {
                day++;
            }
            days[i] = day;
        }
        
        // 배포 그룹 결과를 저장할 리스트
        List<Integer> result = new ArrayList<>();
        
        // 2. 첫 번째 기능을 기준으로 첫 배포 시작
        int now = days[0];  // 현재 배포 기준 날짜
        int group = 1;      // 현재 배포에 포함된 기능 개수
        
        // 3. 두 번째 기능부터 하나씩 보면서 같이 배포할 수 있는지 확인
        for (int i= 1; i < pl; i++) {
            // 현재 기능이 기준 날짜보다 빨리(또는 같이) 끝나면
            // 앞 기능과 같이 배포
            if (days[i] <= now) {
                group++;
            } else {
                // 현재 기능이 기준 날짜보다 늦게 끝나면
                // → 앞 배포에는 못 끼고, 새로운 배포 시작
                result.add(group);
                now = days[i];
                group = 1;
            }
        }
        // 마지막 배포 그룹 추가
        result.add(group);
        
        // List -> 배열 변환
        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }
}

import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int count = 0;
        
        // 부서 신청 금액이 담긴 d를 오름차순으로 정렬
        Arrays.sort(d);
        
        // 정렬된 금액을 앞에서부터 하나씩 확인
        // 가능하면 전체 예산에서 차감하고 count 증가
        for (int i : d) {
            if (budget < i) break;
            budget -= i;
            count++;
        }
        return count;
    }
}

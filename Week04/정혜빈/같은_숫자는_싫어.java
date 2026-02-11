import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> list = new ArrayList<>();
        
        for(int num : arr){
            if (list.isEmpty() || list.get(list.size() -1) != num){
                list.add(num);
            }
        }
        // 자바에서는 List<Integer>를 그대로 반환할 수 없고, 문제 요구사항이 int[]이기 때문에 형 변환 해주기
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}

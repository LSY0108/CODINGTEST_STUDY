import java.util.HashMap;

class Solution {
    public int solution(String[][] clothes) {
        
        // 1. 종류별 개수 저장
        HashMap<String, Integer> map = new HashMap<>();
        
        for (String[] cloth : clothes) {
            String type = cloth[1];
            
            // 해당 종류가 처음이면 1로 저장, 이미 있으면 +1
            map.put(type, map.getOrDefault(type, 0) + 1);
        }
        
        int answer = 1;
        
        // 2. (개수 + 1) 모두 곱하기
        for (int count : map.values()) {
            answer *= count + 1;
        }
        
        // 3. 아무것도 안 입는 경우 제외
        return answer -1;
    }
}

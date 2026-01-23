import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map <String, Integer> map = new HashMap<>();
        
        // 참가자 카운트
        for (String name : participant) {
            map.put(name, map.getOrDefault(name,0) + 1);
        }
        
        // 완주자 카운트 감소
        for (String name: completion) {
            map.put(name, map.get(name) -1);
        }
        
        // value가 0 이상인 사람(key) 반환
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 0) {
                return entry.getKey();
            }
        }
        return "";
    }
}

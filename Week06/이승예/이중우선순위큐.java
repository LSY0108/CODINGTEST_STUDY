import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        
        TreeMap<Integer, Integer> map = new TreeMap<>();
        
        for (String op : operations) {
            
            String[] str = op.split(" ");
            String command = str[0];
            int num = Integer.parseInt(str[1]);
            
            // 삽입
            if (command.equals("I")) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            
            // 삭제
            else if (command.equals("D")) {
                
                // 빈 큐에 데이터를 삭제하라는 연산이 주어질 경우, 해당 연산은 무시
                if (map.isEmpty()) continue;
                
                int key;
                
                // 최댓값 삭제
                if (num == 1) {
                    key = map.lastKey();
                }
                // 최솟값 삭제
                else { // num == -1
                    key = map.firstKey();
                }
                
                // 현재 key 값의 개수가 1이라면 
                // 이번 삭제로 완전히 사라지므로 map에서 제거
                if (map.get(key) == 1) {
                    map.remove(key);
                } 
                // 2개 이상이라면
                // 하나만 삭제해야 하므로 개수만 1 감소
                else {
                    map.put(key, map.get(key) - 1);
                }
            }
        }
        
        if (map.isEmpty()) {
            return new int[]{0, 0};
        }
        
        return new int[]{map.lastKey(), map.firstKey()};
    }
}

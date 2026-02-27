import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
    // clothes[i][1]을 key로(의상 카테고리), clothes[i][0]의 개수를 value로 갖는
    // HashMap을 만들어서 종류별로 몇개의 의상이 있는지 저장하고
    // 각 의상의 개수(value)에 1을 더한 값끼리 곱해서 전체 경우의 수를 구하고 거기에서 전체 다 안입는 경우인 -1을 빼서 return하기
        
        Map<String, Integer> map = new HashMap<>();
        
        for(String[] item : clothes){
            String category = item[1];
            map.put(category, map.getOrDefault(category, 0) + 1);
        }
        
        for(int count : map.values()){
            answer *= (count + 1);
        }
        
        return answer - 1;
    }
}

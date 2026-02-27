import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        Set<Integer> set = new HashSet<>();
        
        int pick = nums.length / 2;
        System.out.println(pick);
        for (int num : nums) {
            set.add(num);
        }
        if (set.size() < pick) {
            answer = set.size();
        } else{
            answer = pick;  
        }
        return answer;
    }
}

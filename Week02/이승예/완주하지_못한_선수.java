// https://school.programmers.co.kr/learn/courses/30/lessons/42576
//완주하지 못한 선수

import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> counter = new HashMap<>();
        
        for (String p : participant) {
            counter.put(p, counter.getOrDefault(p, 0) + 1);
        }
        
        for (String c : completion) {
            counter.put(c, counter.get(c) - 1);
        }
        
        for (String name : counter.keySet()) {
            if(counter.get(name) != 0){
                return name;
            }
        }
        return null;
    }
}

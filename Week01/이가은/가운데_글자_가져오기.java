package Week01;

// https://school.programmers.co.kr/learn/courses/30/lessons/12903

class Solution {
    public String solution(String s) {
        String answer = "";
        int N = s.length();
        
        if (N % 2 == 0) {
     
            answer = s.substring(N / 2 - 1, N / 2 + 1);
        } else {
            
            answer = s.charAt(N / 2) + "";
        }
        
        return answer;
    }
}
}


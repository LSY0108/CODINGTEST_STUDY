// 가운데 글자 가져오기
// https://school.programmers.co.kr/learn/courses/30/lessons/12903

class Solution {
    public String solution(String s) {
        String answer = "";
        int s_length = s.length();
            
        // 단어 길이가 홀수일 때
        if(s_length % 2 == 1) {
            answer = String.valueOf(s.charAt(s_length/2));
        }
        
        // 단어 길이가 짝수일 때
        else {
            answer = s.substring(s_length / 2 - 1, s_length / 2 + 1);
        }
        return answer;
    }
}

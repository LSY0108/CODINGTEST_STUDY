import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> days = new ArrayList<>();
        
        for(int i = 0; i < progresses.length; i++){
            int count = 0;
            while(progresses[i] < 100){
                progresses[i] += speeds[i];
                count += 1;
            }
            days.add(count);
        }
        List<Integer> answerList = new ArrayList<>();
        
        int current = days.get(0);
        int countDeploy = 1;
        
        for(int i = 1; i < days.size(); i++) {
            if (days.get(i) <= current){
                countDeploy += 1;
            }
            else {
                answerList.add(countDeploy);
                current = days.get(i);
                countDeploy = 1;
                }
            }
            answerList.add(countDeploy);
        
            int[] answer = new int[answerList.size()];
            for (int i = 0; i < answerList.size(); i++) {
                answer[i] = answerList.get(i);
            }
        return answer;
    }
}

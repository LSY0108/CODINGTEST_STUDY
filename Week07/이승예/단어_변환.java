import java.util.*;

class Solution {
    public int solution(String begin, String target, String[] words) {
        boolean[] visited = new boolean[words.length];
        Queue<String> queue = new LinkedList<>();
        Queue<Integer> step = new LinkedList<>();
        
        queue.add(begin);
        step.add(0);
        
        while(!queue.isEmpty()) {
            String current = queue.poll();
            int count = step.poll();
            
            if(current.equals(target)) {
                return count;
            }
            
            for (int i = 0; i < words.length; i++) {
                if(!visited[i] && diff(current, words[i]) == 1) {
                    visited[i] = true;
                    queue.add(words[i]);
                    step.add(count + 1);
                }
            }
        }
        return 0;
    }
    
    int diff(String a, String b) {
        int count = 0;
        
        for(int i = 0; i < a.length(); i++) {
            if(a.charAt(i) != b.charAt(i)) {
                count++;
            }
        }
        return count;
    }
}

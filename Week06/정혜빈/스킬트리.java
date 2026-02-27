class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = -0;
        
        char[] arrSkill = skill.toCharArray();
        
        for (String skills : skill_trees) {
            
            StringBuilder filtered = new  StringBuilder();
            
            for (int i = 0; i < skills.length(); i++) {
                char ch = skills.charAt(i);
                
                if (skill.indexOf(ch) != -1) {
                    filtered.append(ch);
                }
            }
            
            boolean possible = true;
            
            for (int i = 0; i < filtered.length(); i++) {
                if (filtered.charAt(i) != arrSkill[i]) {
                    possible = false;
                    break;
                }
            }
             if (possible) {
                answer++;
            }
        }
        return answer;
    }
}

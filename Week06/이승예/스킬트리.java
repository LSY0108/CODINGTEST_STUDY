class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;

        // 1. 각 스킬트리를 하나씩 검사
        for (String tree : skill_trees) {
            int index = 0;          // 현재 배워야 할 skill 위치
            boolean valid = true;

            // 2. "BACDE" 를 앞에서부터 하나씩 검사
            for (int i = 0; i < tree.length(); i++) {
                char current = tree.charAt(i); // 현재 검사 중인 문자 'B'

                // 3. i가 skill에 포함되는 문자인지   "B"가 "CBD"에 포함되는가?
                if (skill.contains(String.valueOf(current))) {
                    // 4. 현재 배워야 할 순서와 같은지 확인
                    // 포함되어 있지 않으면 순서와 상관없으므로 무시
                    if (index < skill.length() && skill.charAt(index) == current) {
                        index++; // 다음 배워야 할 스킬로 이동
                    } else {
                        // 배워야 할 순서가 아니라면 false;
                        valid = false;
                        break;
                    }
                }
            }

            // 5. 끝까지 문제 없으면 가능한 스킬트리니까 answer 증가
            if (valid) {
                answer++;
            }
        }
        return answer;
    }
}
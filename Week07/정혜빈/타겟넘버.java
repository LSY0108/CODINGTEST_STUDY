class Solution {

    int answer = 0; // 결과를 저장할 변수

    public int solution(int[] numbers, int target) {
        dfs(numbers, target, 0, 0); // index=0, total=0부터 시작
        return answer;
    }

    public void dfs(int[] numbers, int target, int index, int total) {

        // 모든 숫자를 다 사용했을 때
        if (index == numbers.length) {
            if (total == target) {   // target과 같다면
                answer++;            // 경우의 수 증가
            }
            return;
        }

        // 현재 숫자를 더하는 경우
        dfs(numbers, target, index + 1, total + numbers[index]);

        // 현재 숫자를 빼는 경우
        dfs(numbers, target, index + 1, total - numbers[index]);
    }
}

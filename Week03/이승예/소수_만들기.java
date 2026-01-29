class Solution {
    public int solution(int[] nums) {
        int count = 0;
        int n = nums.length;

        // nums에서 숫자 세개를 고른다.
        for (int i = 0; i < n-2; i++){
            for (int j = i + 1; j < n-1; j++){
                for (int k = j + 1; k < n; k++){
                    int sum = nums[i] + nums[j] + nums[k];
                    if(isPrime(sum)){
                        count++;
                    }
                }
            }
        }
        return count;
    }

    // 주어진 숫자가 소수인지 판별하는 메서드
    private boolean isPrime(int num) {
        // 0과 1은 소수가 아니므로 false 반환
        if (num < 2) return false;

        // 2부터 num-1까지 나눠보며
        // 하나라도 나누어 떨어지면 소수가 아님
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
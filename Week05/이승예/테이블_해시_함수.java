import java.util.Arrays;

class Solution {
    public int solution(int[][] data, int col, int row_begin, int row_end) {
        
        // 1. col은 1부터 시작 → 인덱스로 쓰려면 -1
        int c = col - 1;
        
        // 2. 정렬
        Arrays.sort(data, (a, b) -> {
            // col번째 컬럼 기준 오름차순
            if (a[c] != b[c]) {
                return a[c] - b[c];
            }
            // col 값이 같으면 기본키(첫 번째 컬럼) 기준 내림차순
            return b[0] - a[0];
        });
        
        int answer = 0;
        
        // 3. row_begin ~ row_end 구간 S_i 계산 후 XOR
        for (int i = row_begin; i <= row_end; i++) {
            
            int sum = 0;
            
            // i번째 행은 data[i-1] (i는 1부터 시작이므로)
            for (int value : data[i - 1]) {
                sum += (value % i);
            }
            
            // XOR 누적
            answer ^= sum;
        }
        
        return answer;
    }
}

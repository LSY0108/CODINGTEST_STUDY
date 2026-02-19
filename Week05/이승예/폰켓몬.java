import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int pickCount = nums.length / 2;

        int typeCount = set.size();

        return Math.min(pickCount, typeCount);
    }
}
import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        Set<String> set = new HashSet<>(Arrays.asList(phone_book));
        
        for (String number : phone_book) {
            String prefix = "";
            
            for (char ch: number.toCharArray()) {
                prefix += ch;
                
                if (set.contains(prefix) && !prefix.equals(number)) {
                    return false;
                }
            }
        }
        return true;
    }
}

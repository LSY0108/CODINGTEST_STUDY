import java.util.*;

class Solution {

    // 두 단어가 한 글자만 다른지 확인
    public boolean diffOne(String a, String b) {
        int cnt = 0;

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                cnt++;
            }
        }

        return cnt == 1;
    }

    public int solution(String begin, String target, String[] words) {

        // target이 words에 없으면 변환 불가
        boolean exists = false;
        for (String w : words) {
            if (w.equals(target)) {
                exists = true;
                break;
            }
        }

        if (!exists) return 0;

        // BFS 큐
        Queue<Node> q = new LinkedList<>();
        q.offer(new Node(begin, 0));

        boolean[] visited = new boolean[words.length];

        while (!q.isEmpty()) {

            Node current = q.poll();
            String curWord = current.word;
            int depth = current.depth;

            // target 도착
            if (curWord.equals(target)) {
                return depth;
            }

            // 다음 단어 탐색
            for (int i = 0; i < words.length; i++) {

                if (!visited[i] && diffOne(curWord, words[i])) {
                    visited[i] = true;
                    q.offer(new Node(words[i], depth + 1));
                }
            }
        }

        return 0;
    }
}

// 단어와 depth 저장 클래스
class Node {
    String word;
    int depth;

    Node(String word, int depth) {
        this.word = word;
        this.depth = depth;
    }
}

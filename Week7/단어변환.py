from collections import deque

def diff_one(a, b):
    # 두 단어가 정확히 한 글자만 다른지 체크
    cnt = 0
    for x, y in zip(a, b):
        if x != y:
            cnt += 1
    return cnt == 1

def solution(begin, target, words):
    # target이 words에 없으면 애초에 변환 불가
    if target not in words:
        return 0

    q = deque()
    q.append((begin, 0))  # (현재 단어, 지금까지 단계)
    visited = [False] * len(words)

    while q:
        cur, depth = q.popleft()

        # target 도착하면 그게 최소 단계
        if cur == target:
            return depth

        # 다음으로 갈 수 있는 단어들(한 글자만 다른 단어) 찾기
        for i, w in enumerate(words):
            if not visited[i] and diff_one(cur, w):
                visited[i] = True          # 큐에 넣을 때 방문 처리(중복 방지)
                q.append((w, depth + 1))   # 한 단계 증가

    return 0

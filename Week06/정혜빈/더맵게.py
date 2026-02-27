import heapq

def solution(scoville, K):
    answer = 0
    #  scoville을 힙 구조로 만들고
    #  heapq.heappop()을 사용해서 첫 번째 작은 값,
    #  또 heappop을 사용해서 두 번째 작은 값을 pop하고
    #  first + (second*2)해서 그 값을 heap에 push해주고 answer += 1 하기
    #  가장 작은 값(heap[0])이 K 이상이 될 때까지 반복
    #  더 이상 섞을 수 없으면 -1 return
    
    heapq.heapify(scoville)
    
    while scoville[0] < K:
        
        if len(scoville) < 2:
            return -1
        
        first = heapq.heappop(scoville)
        second = heapq.heappop(scoville)
        
        heapq.heappush(scoville, first + (second * 2))
        answer += 1

    return answer

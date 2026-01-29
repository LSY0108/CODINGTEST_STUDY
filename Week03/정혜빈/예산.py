def solution(d, budget):
    answer = 0
    sorted_d = sorted(d)
    sum_d = 0
    
    for cost in sorted_d:
        if sum_d + cost > budget:
            break
        sum_d += cost
        answer += 1
    return answer

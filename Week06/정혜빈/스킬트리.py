def solution(skill, skill_trees):
    answer = 0
    arr_skill = list(skill)
    
    # 1. skill_trees의 각 문자열을 하나씩 돈다
    # 2. 그 문자열에서 skill에 포함된 문자만 뽑아서 arr를 만든다
    # 3. 그 다음, arr[i] == skill[i]가 arr의 길이만큼 모두 참이면 통과
    for skills in skill_trees:
        arr_one_skill = []
        
        for ch in skills:
            if ch in arr_skill:
                arr_one_skill.append(ch)
        
        possible = True        
        for item in range(len(arr_one_skill)):
            if arr_one_skill[item] != arr_skill[item]:
                possible = False
                break
        if possible:
            answer += 1
            
    return answer

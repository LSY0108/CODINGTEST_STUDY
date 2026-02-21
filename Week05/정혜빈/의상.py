def solution(clothes):
    answer = 1
    # clothes[1]을 key로(의상 카테고리), clothes[0]의 개수를 value로 갖는
    # HashMap을 만들어서 종류별로 몇개의 의상이 있는지 저장하고
    # 각 의상의 개수(value)에 1을 더한 값끼리 곱해서 전체 경우의 수를 구하고 거기에서 전체 다 안입는 경우인 -1을 빼서 return하기
    cat_count = {}
    
    for name, category in clothes:
        cat_count[category] = cat_count.get(category, 0) + 1
    
    for count in cat_count.values():
        answer *= (count + 1)
    return answer -1

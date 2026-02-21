def solution(nums):
    # 최대 종류의 값을 구하는거니까 nums에서 중복을 제거하고
    # len(nums) // 2값을 기준으로
    # [1,2,3] -> 2개 뽑아야 함
    # [2,3,4] -> 3개 뽑아야 함
    # [2,3] -> 3개 뽑아야 함 근데 중복 제거한 nums 길이가 더 작으니까 nums 길이를 return하면 될듯
    pick = len(nums) // 2
    return len(set(nums)) if len(set(nums)) < pick else pick

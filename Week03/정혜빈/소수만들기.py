from itertools import combinations

def is_prime(x):
    if x < 2:
        return False
    for i in range(2, int(x ** 0.5) +1):
        if x % i == 0:
            return False
    return True

def solution(nums):
    answer = 0
    for a, b, c in combinations(nums, 3):
        if is_prime(a + b + c):
            answer += 1
    return answer

def solution(s):
    half = (len(s)//2)
    return s[half -1:half + 1] if len(s) % 2 == 0 else s[half]

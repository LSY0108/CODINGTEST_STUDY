def solution(s):
    stack = []
    for i in s:
        if i == "(":
            stack.append(i)
        else:
            if not stack:
                return False
            stack.pop()
    return True if len(stack) == 0 else False

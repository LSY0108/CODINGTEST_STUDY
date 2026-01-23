def solution(phone_book):
    set_phone = set(phone_book)
    
    for number in phone_book:
        prefix = ""
        for ch in number:
            prefix += ch
            if prefix in set_phone and prefix != number:
                return False
    return True

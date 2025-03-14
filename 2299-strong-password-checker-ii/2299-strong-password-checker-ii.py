class Solution:
    def strongPasswordCheckerII(self, password: str) -> bool:
        if len(password)<8:
            return False
        has_lower, has_upper, has_digit, has_special = False, False, False, False
        special_characters = "!@#$%^&*()-+"
        for char in password:
            if char.islower():
                has_lower=True
            if char.isupper():
                has_upper=True
            if char in special_characters:
                has_special=True
            if char.isdigit():
                has_digit=True
        for i in range(1,len(password)):
            if password[i]==password[i-1]:
                return False
        if has_lower and has_upper and has_digit and has_special:
            return True
        else:
            return False

        